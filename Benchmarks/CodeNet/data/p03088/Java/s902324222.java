import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	long[][][][] a = new long[N+1][4][4][4];
	a[0][3][3][3] = 1;
	long mod = (long)Math.pow(10,9)+7;
	for(int len = 1; len<N+1; len++) {
	    for(int i = 0; i<4; i++) {
		for(int j = 0; j<4; j++) {
		    for(int k = 0; k<4; k++) {
			if(a[len-1][i][j][k] == 0) continue;
			for(int e = 0; e<4;e++) {
			    if(e==2 && i==1 && j==0) continue;
			    if(e==2 && i==0 && j==1) continue;
			    if(e==1 && i==2 && j==0) continue;
			    if(e==2 && i==1 && k==0) continue;
			    if(e==2 && j==1 && k==0) continue;

			    a[len][e][i][j] += a[len-1][i][j][k];
			    if(a[len][e][i][j]>=mod) a[len][e][i][j] %= mod;
			}
		    }
		}
	    }
	}
	long ans = 0;
	for(int i=0; i<4; i++) {
	    for(int j=0; j<4; j++) {
		for(int k=0; k<4; k++) {
		    ans += a[N][i][j][k];
		    ans %= mod;
		}
	    }
	}
	System.out.println(ans);

    }
}