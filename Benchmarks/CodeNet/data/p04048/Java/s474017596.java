import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long x = scan.nextLong();
		long a = x;
		long b = n - x;
		long sum = n;

		while (true) {

			if (b % a == 0) {
				for (long i = 0; i < b / a; i++) {
					sum += 2 * a;
				}
				sum = sum - a;
				break;
			}else {
				for (long i = 0; i < b / a; i++) {
					sum += 2 * a;
				}
				long num = a;
				a = b % a;
				b = num;
			}
		}

		System.out.println(sum);
		scan.close();
	}

}
