import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// 入力
		final int n, l;
		final String[] s;
		try(Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
			l = scan.nextInt();
			s = new String[n];
			for (int i = 0; i < n; i++) {
				s[i] = scan.next();
			}
			
		}
		Arrays.sort(s);
		
		// 出力
		Arrays.stream(s).forEach(out::print);
		out.println();
		out.flush();
	}

}