import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long x = sc.nextLong();

			if (a == 0) {
				System.out.println(b / x + 1);
			} else {
				System.out.println(b / x - (a - 1) / x);
			}
		}
	}
}