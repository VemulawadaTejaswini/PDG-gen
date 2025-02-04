import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		long ans;
		x = Math.abs(x);

		if (x / d >= k) {
			ans = x - k * d;
		} else {
			long tmp = x % d;
			long remain = k - x / d;

			if (remain % 2 == 0) {
				ans = tmp;
			} else {
				ans = Math.abs(tmp - d);
			}

		}

		System.out.println(ans);

		sc.close();
	}

}
