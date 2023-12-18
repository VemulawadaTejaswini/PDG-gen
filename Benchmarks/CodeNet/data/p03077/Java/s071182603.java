import java.util.Scanner;

public class Main {
	static boolean memo[];
	static int ans, min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long n = sc.nextLong();
		long a = Long.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			a = Math.min(a, sc.nextLong());
		}
		if (n % a == 0) {
			System.out.println(5 + n / a - 1);
		} else {
			System.out.println(5 + n / a);
		}
	}
}
