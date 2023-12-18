import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long x = scan.nextLong();
		long a = x;
		long b = n - x;
		long remainder = b % a;
		long sum = 0;

		while (true) {
			sum += (b - remainder) * 3;

			if (remainder == 0) {
				break;
			}else {
				long num = a;
				a = remainder;
				b = num;
				remainder = b % a;
			}
		}

		System.out.println(sum);
		scan.close();
	}

}
