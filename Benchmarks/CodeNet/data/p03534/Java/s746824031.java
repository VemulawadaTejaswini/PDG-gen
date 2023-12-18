import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static int v = 0;
	static List<List<Integer>> ansList = null;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		br.close();

		int[] cnt = new int[3];
		for (int i = 0; i < s.length; i++) {
			cnt[s[i] - 'a']++;
		}

		int limit = (s.length + 2) / 3;
		for (int i : cnt) {
			if (i > limit) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
