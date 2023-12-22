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
	int i, j;
	String[][] conv = new String[2][n];
	for(i=0; i<n; i++){
	    conv[0][i] = kbd.next();
	    conv[1][i] = kbd.next();
	}

	int m = kbd.nextInt();
	String ans = "";
	for(j=0; j<m; j++){
	    String x = kbd.next();
	    for(i=0; i<n; i++){
		if(x.equals(conv[0][i])){
		    x = conv[1][i];
		    break;
		}
	    }
	    ans += x;
	}
	System.out.println(ans);
    }
}