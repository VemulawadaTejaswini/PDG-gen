import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int mod = 998244353;
		long ans = 1;
		int r = 0;
		int g = 0;
		int b = 0;
		int rg = 0;
		int gb = 0;
		int br = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'R') {
				if (gb > 0) {
					ans = ans * gb % mod;
					gb--;
				} else if (g > 0) {
					ans = ans * g % mod;
					g--;
					rg++;
				} else if (b > 0) {
					ans = ans * b % mod;
					b--;
					br++;
				} else {
					r++;
				}
			} else if (ch == 'G') {
				if (br > 0) {
					ans = ans * br % mod;
					br--;
				} else if (b > 0) {
					ans = ans * b % mod;
					b--;
					gb++;
				} else if (r > 0) {
					ans = ans * r % mod;
					r--;
					rg++;
				} else {
					g++;
				}
			} else {
				if (rg > 0) {
					ans = ans * rg % mod;
					rg--;
				} else if (r > 0) {
					ans = ans * r % mod;
					r--;
					br++;
				} else if (g > 0) {
					ans = ans * g % mod;
					g--;
					gb++;
				} else {
					b++;
				}
			}
		}

		long p = 1;
		for (int i = 2; i <= n; i++) {
			p = p * i % mod;
		}
		System.out.println(ans * p % mod);
	}
}
