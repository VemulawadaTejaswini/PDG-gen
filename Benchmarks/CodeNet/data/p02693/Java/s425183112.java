import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long K = scanner.nextLong();
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long a1;
		long b1;
		a1 = a/K;
		b1 = b/K;
		if (K == 1) {
			System.out.println("OK");
		} else if(a % K == 0 || b % K == 0) {
			System.out.println("OK");
		} else if (b1 != a1) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
}
