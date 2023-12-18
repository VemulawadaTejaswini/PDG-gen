import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] cnt = new int[n][26];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				cnt[i][s.charAt(j) - 'a']++;
			}
		}
		sc.close();

		int[] ans = new int[26];
		Arrays.fill(ans, 51);
		for (int k = 0; k < 26; k++) {
			for (int i = 0; i < n; i++) {
				ans[k] = Math.min(ans[k], cnt[i][k]);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < 26; k++) {
			char[] str = new char[ans[k]];
			Arrays.fill(str, (char) ('a' + k));
			sb.append(str);
		}
		System.out.println(sb.toString());
	}
}
