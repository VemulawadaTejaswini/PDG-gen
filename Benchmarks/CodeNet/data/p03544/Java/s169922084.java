import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int N = s.nextInt() + 1;
		long a = 2;
		long b = 1;
		long ans = 0;

		for (int i = 1; i < N - 1; i++) {
			ans = a + b;
			a = b;
			b = ans;
		}
		if (N == 2) {
			System.out.println(b);
		} else {
			System.out.println(ans);
		}
	}
}
