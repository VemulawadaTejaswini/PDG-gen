import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] c = new int[n];
		int[] s = new int[n];
		int[] f = new int[n];
		for (int i = 0; i < n - 1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			int now = s[i] + c[i];
			for (int j = i + 1; j < n - 1; j++) {
				if (now <= s[j]) {
					now = s[j];
				} else {
					int mod = Math.floorMod(now, f[j]);
					if (mod > 0) {
						now += f[j] - mod;
					}
				}
				now += c[j];
			}
			System.out.println(now);
		}
	}
}
