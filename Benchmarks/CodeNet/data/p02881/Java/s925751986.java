import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long n = Long.parseLong(scanner.nextLine());

		long a = 0;
		long b = 0;

		long ans = Long.MAX_VALUE;

		for(int i = 1; i < Math.sqrt(n); i++) {

			if(n % i == 0) {
				a   = i;
				b   = n / i;
				ans = Math.min(ans, a + b - 2);

			}

		}

		System.out.println(ans);

	}
}
