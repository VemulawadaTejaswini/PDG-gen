import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int[] ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String b = br.readLine().replaceAll(" ", "");

		ans = new int[n];
		boolean flg = dfs("", n, b, ans);
		if (flg) {
			for (int i = 0; i < n; i++) {
				System.out.println(ans[i]);
			}
		} else {
			System.out.println(-1);
		}
	}

	static boolean dfs(String str, int n, String b, int[] ans) {
		if (str.length() == n) {
			if (str.equals(b)) {
				return true;
			}
			return false;
		}
		for (int i = 1; i <= str.length() + 1; i++) {
			ans[str.length()] = i;
			boolean flg = dfs(str.substring(0, i - 1) + i + str.substring(i - 1, str.length()), n, b, ans);
			if (flg) {
				return true;
			}
		}
		return false;
	}
}
