import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		assert (N >= 1 && N <= 10000);

		int m = 0;
		int[] apple = new int[N];
		for (int i = 0; i < N; i++) {
			apple[i] = sc.nextInt();
			m = Math.max(m, apple[i]);
		}
		final String first = "first";
		final String second = "second";

		Arrays.sort(apple);
		boolean f = false;
		for (int i = N; i > 0; i--) {
			int a = apple[i - 1];
			if (apple[i - 1] % 2 == 1) {
				f = !f;
			}
			while (i > 0 && apple[i - 1] == a) {
				i--;
			}
		}
		System.out.println(f ? first : second);
		sc.close();
	}

}
