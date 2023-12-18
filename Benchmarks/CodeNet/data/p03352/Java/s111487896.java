	import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int X = sc.nextInt();

		sc.close();

		int ans = 0;
		for (int b = 1; b <= 1000; b++) {
			for (int p = 2; p <= 10; p++) { //2^10 == 1024なので、10まで調べればX<=1000の範囲はおｋ
				long z = (long) Math.pow(b, p);
				if (z <= X) {
					ans = Math.max(ans, (int) z);
				}
			}
		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
