import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1 = -1, a2 = -1, a3 = -1;
		int c1 = 0, c2 = 0, c3 = 0;
		int a;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (a1 == a) {
				c1++;
				continue;
			} else if (a2 == a) {
				c2++;
				continue;
			} else if (a3 == a) {
				c3++;
				continue;
			}
			if (-1 == a1) {
				a1 = a;
				c1++;
				continue;
			} else if (-1 == a2) {
				a2 = a;
				c2++;
				continue;
			} else if (-1 == a3) {
				a3 = a;
				if ((a1 ^ a2) != a3) {
					System.out.println("No");
					return;
				}
				c3++;
				continue;
			}
			System.out.println("No");
			return;
		}
		if (0 == a1 && -1 == a2) {
			System.out.println("Yes");
			return;
		} else if ((0 == a1 || 0 == a2) && -1 == a3) {
			if ((0 == a1 && c1 * 2 == c2) || (0 == a2 && c2 * 2 == c1)) {
				System.out.println("Yes");
				return;
			}
			System.out.println("No");
			return;
		} else if (c1 == c2 && c1 == c3) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}
