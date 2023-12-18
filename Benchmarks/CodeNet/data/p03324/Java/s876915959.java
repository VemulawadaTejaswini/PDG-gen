import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int D = scanner.nextInt();
		int N = scanner.nextInt();

		if (D == 0) {
			if (N != 100) {
				System.out.println(N);
			} else {
				System.out.println(N+1);
			}
		} else if (D == 1) {
			if (N != 100) {
				System.out.println(N*100);
			} else {
				System.out.println(N*100+1);
			}
		} else {
			if (N != 100) {
				System.out.println(N*10000);
			} else {
				System.out.println(N*10000+1);
			}
		}
	}
}