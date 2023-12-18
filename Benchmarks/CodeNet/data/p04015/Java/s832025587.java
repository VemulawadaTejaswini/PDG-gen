

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long[][][] dp;
	static int N;
	static int A;
	static int[] X;

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    N=gi();
	    A=gi();
	    X=new int[N+1];
	    dp=new long[N+1][N+1][N*A+1];

        for (int i=1; i<=N; i++) {
        	X[i]=gi();
        }

        Arrays.parallelSort(X);

        for (int i=0; i<=N; i++) {
        	dp[i][0][0]=1;
        }
        for (int i=1; i<=N; i++) {
			int a=X[i];
        	for (int j=1; j<=i; j++) {
        	    for (int k=1; k<=N*A; k++) {
        	    	dp[i][j][k]=dp[i-1][j][k];
        	    	if(k>=a) {
        	    		dp[i][j][k]+= dp[i-1][j-1][k-a];
        			}
                }
            }
        }

        long ans=0;
        for(int i=1; i<=N; i++) {
        	ans+=dp[N][i][i*A];
        }
        System.out.println(ans);

//        if(ans==0) {
//
//		    System.out.println("Yes");
//        } else {
//        	System.out.println("No");
//
//        }
	}

	// 約数の数を計算
		public static int yakusuC(int n) {
			StringBuilder sb = new StringBuilder();
			int c=0;
			for (int i=1; i<=n; i++) {
				if (n%i==0) {
					c++;
				}
			}

			return c;
		}
	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}