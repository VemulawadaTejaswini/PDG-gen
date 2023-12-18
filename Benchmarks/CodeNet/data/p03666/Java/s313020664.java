import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 * --------------------------------------------------
 * Main Class
 * --------------------------------------------------
 */
public class Main {

	public void exec() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		long n = input.nextInt();
		long a = input.nextInt();
		long b = input.nextInt();
		long c = input.nextInt();
		long d = input.nextInt();
		
		boolean ret = false;
		for (long m=0; m<n; m++) {
			if (c*(n-1-m) - d*m <= b - a && b - a <= d*(n-1-m) - c*m) {
				ret = true;
				break;
			}
		}
		out.println(ret ? "YES":"NO");
		out.flush();
		input.close();
	}

	public static void main(String[] args) throws IOException {
//		long time = System.currentTimeMillis();
		new Main().exec();
//		System.out.println(System.currentTimeMillis() - time);
	}
}
