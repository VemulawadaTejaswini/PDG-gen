import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();

		if (a == b) {
			System.out.println("YES");
			return;
		}
		while (t != 0) {
			b += w;
			if (a < b && b <= (a + v)) {
				System.out.println("YES");
				return;
			}
			a += v;
			t--;
		}

		System.out.println("NO");

	}
}
