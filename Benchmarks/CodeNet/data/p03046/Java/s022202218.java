import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int m = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		br.close();

		int n = (int) Math.pow(2, m);
		if (k >= n) {
			System.out.println(-1);
			return;
		}

		if (k == 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				sb.append(i).append(' ');
			}
			for (int i = n - 1; i >= 0; i--) {
				sb.append(i).append(' ');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());

		} else {
			int xor = 0;
			for (int i = 0; i < n; i++) {
				if (i != k) {
					xor ^= i;
				}
			}
			if (xor != k) {
				System.out.println(-1);
				return;
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				if (i != k) {
					sb.append(i).append(' ');
				}
			}
			sb.append(k).append(' ');
			for (int i = n - 1; i >= 0; i--) {
				if (i != k) {
					sb.append(i).append(' ');
				}
			}
			sb.append(k);
			System.out.println(sb.toString());
		}
	}
}
