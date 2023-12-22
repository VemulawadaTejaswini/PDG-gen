import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
	private static final String VOWEL = "aeiou";

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;

			int max = 0;

			ArrayList<String> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				String str = br.readLine();
				max = Math.max(str.length(), max);
				list.add(str);
			}
			int ans = 0;
			Set<String> set;
			while (++ans <= max) {
				set = new HashSet<>();
				for (String str : list) {
					set.add(trim(str, ans));
				}
				if (set.size() == n) {
					break;
				}
			}

			System.out.println(ans > max ? -1 : ans);
		}
	}

	static String trim(String str, int len) {
		StringBuilder sb = new StringBuilder();
		boolean flg = true;
		for (char elm : str.toCharArray()) {
			if (flg) {
				sb.append(elm);
				flg = false;
			}
			if (VOWEL.indexOf(elm) >= 0) {
				flg = true;
			}
		}
		return sb.toString().substring(0, Math.min(len, sb.length()));
	}
}

