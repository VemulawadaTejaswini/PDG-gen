import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		long k = Integer.parseInt(br.readLine());
		br.close();

		long ans = 0;
		boolean odd1 = false;
		boolean oddn = false;
		int cnt = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) == s.charAt(i)) {
				cnt++;
			} else {
				if (ans == 0) {
					odd1 = cnt % 2 == 1;
				}
				ans += cnt / 2;
				cnt = 1;
			}
		}
		oddn = cnt % 2 == 1;
		ans += cnt / 2;
		ans *= k;
		if (odd1 && oddn && s.charAt(0) == s.charAt(s.length() - 1)) {
			ans += k - 1;
		}
		System.out.println(ans);
	}
}
