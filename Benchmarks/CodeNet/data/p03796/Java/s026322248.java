import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long power = 1;
		for (long i = 1; i <= n; i++) {
			power *= i;
		}

		System.out.println(power % 1_000_000_007);

		sc.close();
	}

}