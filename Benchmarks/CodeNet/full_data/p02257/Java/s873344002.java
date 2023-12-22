import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

//		long[] li = new long[n];
//		for (int i=0; i < n; i++) {
//			li[i] = sc.nextLong();
//		}

		int count = 0;
		for (int i=0; i < n; i++) {
			int x = sc.nextInt();
			if ( isPrime(x) ) count++;
		}

		System.out.println(count);

	}

	static boolean isPrime(int n) {
		if (n < 2) return false;
		else if (n == 2) return true;
		else {
			if (n % 2 == 0) return false;
			else {

				int i = 2;
				while (i*i <= n) {
					if (n % i == 0) return false;
					i++;
				}
				return true;

			}
		}
	}

}