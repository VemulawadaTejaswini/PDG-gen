import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out);) {
			long n = Long.parseLong(scan.next());
			long a = Long.parseLong(scan.next());
			long b = Long.parseLong(scan.next());

			long ret = 0;

			while (true) {

				n -= a;
				ret += a;

				if (n < 0) {
					ret += n;
					break;
				}

				n -= b;
				if (n < 0) {
					break;
				}
			}

			out.println(ret);
			out.flush();
		}
	}
}
