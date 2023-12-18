import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] c = new int[n + 1];
		for (int i = 0; i < n; i++) {
			c[a[i]]++;
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] == n - 1) {
				System.out.println(-1);
				return;
			}
		}
		throw new Exception();
	}
}
