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
		final long S = sc.nextLong();
		out.print("0 0");
		if(S <= 1000000000L) {
			out.print(" 1 0 0 "+S);
			return;
		}

		final long h = (long)Math.sqrt(S);
		for(long a = h; a > 0; a--) {
			if(S%a == 0) {
				final long b = S / a;
				out.print(" 0 "+a);
				out.print(" "+b+" 0");
				break;
			}
		}
	}
}
