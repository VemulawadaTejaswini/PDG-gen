

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static long sum(int L, int R, int[] a ) {
		long sum =0;
		for(int i=L; i<=R;i++) {
			sum+= a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		int arr [] = new int[n];
		for( int i= 0; i<n; i++ )
			arr[i]= in.nextInt();
		long dp[][] = new long [n][n];
		for(int i=0;i<n; i++) {
			Arrays.fill(dp[i], (long)1e18 + 5);
			
		}
		
		for( int L= n-1; L>=0;L--) {
			for( int R=L;R<n;R++) {
				if(L==R)
					dp[L][R] = 0;
				else {
					long sum =sum(L,R,arr);
					for( int i=L; i<=R-1;i++) {
						dp[L][R] = Math.min(dp[L][R], dp[L][i] + dp[i+1][R] + sum);
					}
				}
			}
		}
		System.out.println(dp[0][n-1]);
	}

}
