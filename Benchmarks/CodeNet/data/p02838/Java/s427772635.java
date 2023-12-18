import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sa[i]);
		}
		br.close();

		int[][] cnt = new int[62][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < cnt.length; j++) {
				cnt[j][(int) ((a[i] >> j) & 1)]++;
			}
		}

		int mod = 1000000007;
		long ans = 0;
		for (int j = 0; j < cnt.length; j++) {
			long val = 1L << j;
			val *= cnt[j][0];
			val %= mod;
			val *= cnt[j][1];
			val %= mod;
			ans += val;
			ans %= mod;
		}
		System.out.println(ans);
	}
}
