import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		final int C = sc.nextInt();

		int m = Math.max(A, Math.max(B, C));

		int d = 3 * m - (A + B + C);
		if (d % 2 == 0) {
			System.out.println(d / 2);
		} else {
			System.out.println((d + 3) / 2);
		}
		sc.close();

	}

}