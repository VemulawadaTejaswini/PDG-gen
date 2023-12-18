import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();

		int ans = 0;
		for (int r = 0; r <= N / R; r++) {
			for (int g = 0; g <= N / G; g++) {
				int x = r * R + g * G;
				if (x <= N && (N - x) % B == 0) {
					ans++;
				}
			}
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
