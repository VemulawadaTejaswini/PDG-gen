import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		sc.close();
		if (n == 0) {
			System.out.println(0);
			return;
		}

		if (n >= k) {
			System.out.println(n - ((long) (n / k)));
		}else {
			System.out.println(k - ((long) (k / n)));
		}
	}
}
