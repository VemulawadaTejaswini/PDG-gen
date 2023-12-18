import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long ans = 1;

		for (int i = 2; i <= 3; i++) {
			if (a % i == 0 && b % i == 0) {
				ans++;
			}
		}

		for (long i = 5; i <= Math.sqrt(Math.min(a, b)); i += 2) {
			if (a % i == 0 && b % i == 0 && IsPrime(i)) {
				ans++;
			}
		}
		System.out.println(ans);

	}

	static boolean IsPrime(long n) {
		if (n % 2 == 0)
			return false;
		double sqrtNum = Math.sqrt(n);
		for (long i = 3; i <= sqrtNum; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
