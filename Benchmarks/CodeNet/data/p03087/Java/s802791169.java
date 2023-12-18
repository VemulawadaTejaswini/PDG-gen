import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	static void exec(Scanner in, PrintStream out) {
		in.nextInt();
		int Q = in.nextInt();
		String S = in.next();
		for (int i = 0; i < Q; i += 1) {
			int l = in.nextInt();
			int r = in.nextInt();
			String sub = S.substring(l - 1, r);
			int count = 0;
			for (int fromIndex = 0;;) {
				int index = sub.indexOf("AC", fromIndex);
				if (index >= 0) {
					count += 1;
					fromIndex = index + "AC".length();
				} else {
					break;
				}
			}
			out.println(count);
		}
	}

	public static void main(String[] args) {
		exec(new Scanner(System.in), System.out);
	}

}
