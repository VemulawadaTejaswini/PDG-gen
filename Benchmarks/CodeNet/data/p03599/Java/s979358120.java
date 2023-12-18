import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() * 100;
		int b = sc.nextInt() * 100;
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		sc.close();

		int ans1 = 100;
		int ans2 = 0;
		for (int w = 100; w < f; w+=100) {
			if (can(a, b, w)) {
				int rem = Math.min(e * w / 100, f - w);
				if (rem < c) {
					continue;
				}
				for (int s = rem; s >= 0; s--) {
					if (can(c, d, s)) {
						int alt1 = w + s;
						int alt2 = s;
						if (alt2 * ans1 > ans2 * alt1) {
							ans1 = alt1;
							ans2 = alt2;
						}
						break;
					}
				}
			}
		}
		System.out.println(ans1 + " " + ans2);
	}

	static boolean can(int a, int b, int v) {
		if (v % a == 0) {
			return true;
		}
		for (int i = v; i >= 0; i-=a) {
			if (i % b == 0) {
				return true;
			}
		}
		return false;
	}
}
