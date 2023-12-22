import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		for (int i = 0; i < k; i++) {
			int[] b = new int[n + 1];
			for (int j = 0; j < n; j++) {
				int l = Math.max(j - a[j], 0);
				int r = Math.min(j + a[j] + 1, n);
				b[l]++;
				b[r]--;
			}
			for (int j = 1; j < b.length; j++) {
				b[j] += b[j - 1];
			}
			a = b;

			boolean all = true;
			for (int j = 0; j < n; j++) {
				if (a[j] < n) {
					all = false;
					break;
				}
			}
			if (all) {
				break;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(a[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
