import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] s = br.readLine().toCharArray();
		br.close();

		int ans = 0;
		int w = 0;
		int r = n - 1;
		while (w < r) {
			while (w < n && s[w] == 'R') {
				w++;
			}
			while (r >= 0 && s[r] == 'W') {
				r--;
			}
			if (w < r) {
				ans++;
				w++;
				r--;
			}
		}
		System.out.println(ans);
	}
}
