import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();
		System.out.println(process(n, a, b));
	}

	private static long process(long n, long a, long b) {
		long diff = b - a;
		if (diff % 2 == 0) {
			return diff / 2;
		}
		return Math.min(b - 1, n - a);
	}
}
