import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int N = sc.nextInt();

		sc.close();

		int d = 0;

		if (D == 0) {
			d = 0;
		} else if (D == 1) {
			d = 100;
		} else if (D == 2) {
			d = 10000;
		}

		System.out.print(N * d);

	}
}