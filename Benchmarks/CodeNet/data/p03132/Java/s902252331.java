import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int[] a = new int[l];
		for (int i = 0; i < l; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		long[] b = new long[l + 1];
		for (int i = 0; i < l; i++) {
			b[i + 1] = b[i] + a[i];
		}

		long ans = b[l];
		long[] dplr = new long[l + 1];
		long[] dpll = new long[l + 1];
		long[] dprr = new long[l + 1];
		long[] dpll0 = new long[l + 1];
		long[] dprr0 = new long[l + 1];
		for (int i = 0; i < l; i++) {
			dplr[i + 1] = Math.min(Math.min(dplr[i], dprr[i]), b[i]) + (a[i] % 2 ^ 1);
			dpll0[i + 1] = Math.min(Math.min(Math.min(dplr[i], dpll[i]), dprr[i]), b[i]) + a[i] % 2;
			dprr0[i + 1] = Math.min(dprr[i], b[i]) + a[i] % 2;
			dpll[i + 1] = dpll0[i + 1];
			dprr[i + 1] = dprr0[i + 1];
			if (a[i] == 0) {
				dpll[i + 1] += 2;
				dprr[i + 1] += 2;
			}
			long val = Math.min(Math.min(dplr[l], dpll0[l]), dprr0[l]) + b[l] - b[i];
			ans = Math.min(ans, val);
		}
		System.out.println(ans);
	}
}
