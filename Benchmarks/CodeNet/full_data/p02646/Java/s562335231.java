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
			a += v;
			b += w;
			if (a == b) {
				System.out.println("YES");
				return;
			}
			t--;
		}

		System.out.println("NO");

	}
}
