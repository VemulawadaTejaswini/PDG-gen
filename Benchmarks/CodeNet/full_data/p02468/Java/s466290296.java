import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long m = scan.nextLong();
		long n = scan.nextLong();
		run(m, n, (long) 1000000007);
		scan.close();
		System.exit(0);
	}

	private static void run(long m, long n, long M) {
		long result = 1;
		for (; n > 0; n--) {
			result *= m;
			result = result % M;
		}
		System.out.println(result);
	}
}