import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		long s = sc.nextLong();
		long c = sc.nextLong();
		long ans = 0;

		if (s * 2 < c) {
			ans += s;
			c -= 2 * s;
			ans += Math.floor(c / 4);
		} else {
			ans += Math.floor(c / 2);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
