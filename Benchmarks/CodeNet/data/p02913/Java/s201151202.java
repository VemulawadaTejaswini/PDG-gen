import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] s = br.readLine().toCharArray();
		br.close();

		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			label:
			for (int j = i + 1; j < n; j++) {
				int end = j - i;
				if (j + end > n) {
					end = n - j;
				}
				for (int k = 0; k < end; k++) {
					if (s[i + k] != s[j + k]) {
						ans = Math.max(ans, k);
						continue label;
					}
				}
				ans = Math.max(ans, end);
			}
		}
		System.out.println(ans);
	}
}
