import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int M = sc.nextInt();
		final int D = sc.nextInt();

		int cnt = 0;

		for(int m=4;m<=M;m++) {
			for(int d=22;d<=D;d++) {
				final int d1 = d%10;
				if(d1 < 1) {
					continue;
				}
				final int d2 = d/10;
				if(d1*d2==m) {
					cnt++;
				}
			}
		}
		out.println(cnt);

	}
}
