import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] a = br.readLine().toCharArray();
		br.close();

		boolean one = false;
		for (int i = 0; i < n; i++) {
			if (a[i] == '2') {
				one = true;
				break;
			}
		}

		int[] p = new int[n];
		for (int i = 2; i < n; i+=2) {
			int x = i;
			while (x % 2 == 0) {
				p[i]++;
				x /= 2;
			}
		}
		for (int i = 1; i < n; i++) {
			p[i] += p[i - 1];
		}

		if (!one) {
			for (int i = 0; i < n; i++) {
				if (a[i] == '3') {
					a[i] = '2';
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == '2') {
				if (p[n - 1] - p[i] - p[n - 1 - i] <= 0) {
					ans++;
				}
			}
		}
		System.out.println(ans % 2);
	}
}
