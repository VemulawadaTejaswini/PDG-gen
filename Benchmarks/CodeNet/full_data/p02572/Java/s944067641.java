

import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		long[] pre = new long[n];
		
		int MOD = (int)1e9+7;
		
		for(int i=0; i<n; i++) {
			pre[i] = ((i-1>=0?pre[i-1]:0)+a[i])%MOD;
		}
		
		long ans = 0;
		
		for(int i=0; i<n; i++) {
			long val = pre[n-1]-pre[i];
			ans += a[i]*val;
			ans %= MOD;
		}
		
		System.out.println(ans);
		
	}

}
