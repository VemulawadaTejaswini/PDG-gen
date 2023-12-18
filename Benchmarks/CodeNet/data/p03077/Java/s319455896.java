import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		sc.close();

		long max = 0;
		max = Math.max(max, n / a);
		max = Math.max(max, n / b);
		max = Math.max(max, n / c);
		max = Math.max(max, n / d);
		max = Math.max(max, n / e);
		System.out.println(max + 5);
	}
}
