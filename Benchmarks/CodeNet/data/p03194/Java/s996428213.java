import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long P = sc.nextLong();
		long num = 1;
		long n = 1;

		for (long i = 1; n <= P; i++) {

			if (P % i != 0) {
				continue;
			}

			n = (long) Math.pow(i, N);

			if (P%n == 0) {
				num = i;
			}
		}
		System.out.println(num);
	}
}
