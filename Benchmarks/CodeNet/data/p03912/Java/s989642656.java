import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] cnt = new int[100001];
		int[] cntm = new int[m];
		for (int i = 0; i < n; i++) {
			cnt[x[i]]++;
			cntm[x[i] % m]++;
		}

		int ans = cntm[0] / 2;
		cntm[0] = 0;
		for (int i = 1; i < (m + 1) / 2; i++) {
			int v = Math.min(cntm[i], cntm[m - i]);
			ans += v;
			cntm[i] -= v;
			cntm[m - i] -= v;
		}
		if (m % 2 == 0) {
			ans += cntm[m / 2] / 2;
			cntm[m / 2] = 0;
		}

		for (int i = 0; i < 100000; i++) {
			while (cnt[i] >= 2 && cntm[i % m] >= 2) {
				cnt[i] -= 2;
				cntm[i % m] -= 2;
				ans++;
			}
		}
		System.out.println(ans);
	}
}
