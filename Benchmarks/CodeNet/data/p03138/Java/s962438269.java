import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		String[] a = new String[N];
		int max = 42;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			// 二進数を42桁で左側を0で埋める
			a[i] = String.format("%42s", Long.toBinaryString(A[i])).replace(" ", "0");
		}
		sc.close();
		String k = String.format("%42s", Long.toBinaryString(K)).replace(" ", "0");

		long[] c = new long[max];
		int[] b = new int[max];
		for(int i = 0; i < max; i++) {
			if(k.charAt(i) == '1') {
				b[i]++;;
			}
		}
		for(String s : a) {
			for(int i = 0; i < max; i++) {
				if(s.charAt(i) == '1') {
					c[i]++;
				}
			}
		}
		long[][] dp = new long[max + 1][2];
		for(int i = 0; i <= max; i++) {
			dp[i][0] = -1;
			dp[i][1] = -1;
		}
		dp[0][0] = 0;
		for(int i = 0; i < max; i++) {
			long t = (long)Math.pow(2, max - 1 - i);
			long v0 = t * c[i];			// i桁目を0としたときの報酬
			long v1 = t * (N - c[i]);	// i桁目を1としたときの報酬
			if(dp[i][1] != -1) {
				dp[i + 1][1] = Math.max(dp[i + 1][1], dp[i][1] + Math.max(v0, v1));
			}

			if(dp[i][0] != -1) {
				if(b[i] == 1) {
					dp[i + 1][1] = Math.max(dp[i + 1][1], dp[i][0] + v1);
					dp[i + 1][0] = Math.max(dp[i + 1][0], dp[i][0] + v0);
				}else {
					dp[i + 1][0] = Math.max(dp[i + 1][0], dp[i][0] + v0);
				}
			}
		}
		long ans = Math.max(dp[max][0], dp[max][1]);
		System.out.println(ans);
	}
	static void disp(long[] a) {
		for(long i : a) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
	static void disp(int[] a) {
		for(long i : a) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
}