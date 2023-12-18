import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		sc.close();

		int mod = 2019;
		if (l / mod < r / mod) {
			System.out.println(0);
		} else {
			int ml = l % mod;
			int mr = r % mod;
			int ans = mod;
			for (int i = ml; i < mr; i++) {
				for (int j = i + 1; j <= mr; j++) {
					ans = Math.min(ans, i * j % mod);
				}
			}
			System.out.println(ans);
		}
	}
}
