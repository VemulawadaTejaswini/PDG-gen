import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int t = Integer.parseInt(sa[1]);
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]);
			int b = Integer.parseInt(sa[1]);
			if (b <= t) {
				ans = Math.min(ans, a);
			}
		}
		br.close();

		if (ans == Integer.MAX_VALUE) {
			System.out.println("TLE");
		} else {
			System.out.println(ans);
		}
	}
}
