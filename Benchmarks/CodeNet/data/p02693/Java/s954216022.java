import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long K = scanner.nextInt();
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		long a1;
		long b1;
		a1 = a/K;
		b1 = b/K;
		if (K == 1) {
			System.out.println("OK");
		} else if(K == a || K == b) {
			System.out.println("OK");
		} else if (b1 != a1) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
}
