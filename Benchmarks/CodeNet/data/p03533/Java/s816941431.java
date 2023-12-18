import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine() + "!";
		br.close();

		String t = "KIHBR!";
		int i = 0;
		for (int j = 0; j < t.length(); j++) {
			int cnt = 0;
			while (i < s.length() && s.charAt(i) != t.charAt(j)) {
				if (s.charAt(i) != 'A') {
					System.out.println("NO");
					return;
				}
				i++;
				cnt++;
			}
			if (cnt > 1) {
				System.out.println("NO");
				return;
			}
			i++;
		}
		System.out.println("YES");
	}
}
