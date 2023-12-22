import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		solve(n);
	    }
	}
    }

    static void solve(int n){
	int[][] s = new int[n+1][n+1];
	int i, j;
	for(i=0; i<n; i++){
	    for(j=0; j<n; j++){
		s[i][j] = kbd.nextInt();
		s[n][j] += s[i][j];
		s[i][n] += s[i][j];
		s[n][n] += s[i][j];
	    }
	}

	for(i=0; i<n+1; i++){
	    for(j=0; j<n+1; j++){
		System.out.printf("%5d", s[i][j]);
	    }
	    System.out.println();
	}
    }
}