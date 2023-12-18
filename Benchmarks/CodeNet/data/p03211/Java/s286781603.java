import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();

		int ans = 1000;
		for(int i=0;i<=s.length()-3;i++) {
			String x = s.substring(i, i+3);
			int n = Integer.parseInt(x);
			ans = Math.min(ans, Math.abs(n-753));
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
