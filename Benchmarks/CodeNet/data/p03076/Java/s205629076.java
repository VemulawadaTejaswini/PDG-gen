import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int[] a = new int[5];
		int idx = -1;
		int mm = 10;
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			int m = a[i] % 10;
			if (m != 0 && m < mm) {
				idx = i;
				mm = m;
			}
		}

		int ans = 0;
		for (int i = 0; i < 5; i++) {
			if (i == idx) {
				ans += a[i];
			} else {
				ans += (int) (Math.ceil(a[i] / 10.0) * 10);
			}
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
