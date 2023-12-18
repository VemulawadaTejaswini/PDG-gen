
import java.util.*;

public class Main {// Main
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n =sc.nextInt();
		long k = sc.nextLong();
		long[][] ar = input( n , n );
		
		ar = matrix_power(ar, k);
		long ans = 0 ;
		for(long[] key : ar) {
			for(long val : key) {
				ans += val %mod;
				ans %= mod;
			}
		}
		System.out.println(ans);
	}
		static long mod = 1000000007;
	public static long[][] matrix_power(long[][] ar , long k ){
		if(k==1) {
			return ar;
		}
		long [][] temp = matrix_power(ar, k/2);
		temp = matrix_exp(temp , temp);
		if(k%2==1) {
			temp = matrix_exp(temp, ar);
		}
		return temp;
	}
	public static long[][] matrix_exp(long[][] a , long[][]  b){
		int n = a.length;
		long[][] ans = new long[n][n];
		for(int i = 0 ;i < n;i++) {
			for(int j = 0 ;j < n;j++) {
				long temp =0  ;
				for(int k = 0 ;k < n;k++) {
					temp =(temp %mod +(a[i][k]*b[k][j] )%mod )%mod;
				}
				ans[i][j]=temp%mod;
			}
		}
		return ans;
	}
	public static long[][] input(int n, int m) throws Exception {

		long[][] arr = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}


}

