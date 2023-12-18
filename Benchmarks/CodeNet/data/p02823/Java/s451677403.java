import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long ans = 0;
		if ((a - b) % 2 == 0) {
			ans = Math.abs((a - b)) / 2;
		} else {
			long x = Math.max(a, b);
			long y = Math.max(n - a, n - b);
			ans = Math.min(x, y) - 1;
		}

		System.out.println(ans);

		sc.close();
	}

}
