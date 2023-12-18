import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		long count = 0;
		count = b / x;
		count -= (a - 1) / x;

		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
