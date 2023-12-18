import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}
		br.close();

		int ans = 0;
		int a = 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			ans += s[i].split("AB", -1).length - 1;
			if (s[i].charAt(s[i].length() - 1) == 'A') {
				a++;
			}
			if (s[i].charAt(0) == 'B') {
				b++;
			}
		}
		System.out.println(ans + Math.min(a, b));
	}
}
