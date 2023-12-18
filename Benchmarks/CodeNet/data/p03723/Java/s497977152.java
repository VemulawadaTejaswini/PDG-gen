import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		if (a == b && b == c && a % 2 == 0) {
			System.out.println(-1);
		} else {
			int ans = 0;
			while (true) {
				if (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) {
					break;
				}
				int ab = a + b;
				int bc = b + c;
				int ca = c + a;
				a = bc / 2;
				b = ca / 2;
				c = ab / 2;
				ans++;
			}
			System.out.println(ans);
		}
	}
}
