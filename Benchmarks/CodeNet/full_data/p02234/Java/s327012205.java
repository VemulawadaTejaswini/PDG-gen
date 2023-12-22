import java.util.Scanner;

public class Main{
    public static void main(String[] args){

	final int N = 100;
	Scanner scan = new Scanner(System.in);
	int[][] m = new int[N+1][N+1];
	int[] p = new int[N];

	int n = scan.nextInt();
	
	for(int i = 1; i <= n; i++){
	    p[i-1] = scan.nextInt();
	    p[i] = scan.nextInt();
	}
	
	for(int i = 1; i <= n; i++){
	    m[i][i] = 0;
	}
	for(int i = 2; i <= n; i++) {
	    for(int j = 1; j <= n - i + 1; j++){
		int k = j + i - 1;
		m[j][k] = (1 << 21);
      
		for(int l = j; l <= k - 1; l++){
		    m[j][k] = Math.min(m[j][k],m[j][l] + m[l+1][k] + p[j-1] * p[l] * p[k]);
		}
	    }
	}
	System.out.println(m[1][n]);

    }
}


