import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		run(n);
		scan.close();
		System.exit(0);
	}

	private static void run(long n) {
		System.out.print(n + ":");
		double max = Math.sqrt(n);
		for (long i = 2; i <= max && i < n;) {
			if (n % i == 0) {
				System.out.print(" " + i);
				n /= i;
			} else
				i++;
		}
		if (n == 1)
			System.out.println();
		else
			System.out.println(" " + n);
	}

}