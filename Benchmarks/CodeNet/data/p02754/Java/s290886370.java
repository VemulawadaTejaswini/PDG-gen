import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long answer = 0;
		long quot = 0;
		long mod = 0;

		quot = n / (a + b);
		mod = n % (a + b);

		if (a <= mod) {
			answer = quot * a + a;
		} else {
			answer = quot * a +  mod;
		}

		System.out.println(answer);
	}
}