import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int a1;
		int b1;
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
