import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static PrintWriter out;
	static void solve() {
		int answer = 0;
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if (a < b) {
			answer += a;
			if(b < c) {
				answer += b;
				out.println(answer);
				return;
			}
			answer += c;
			out.println(answer);
			return;
		}
		answer += b;
		if (a < c) {
			answer += a;
			out.println(answer);
			return;
		}
		answer += c;
			out.println(answer);
			return;
	}
	public static void main(String[] args) {
		in = new Scanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		out.close();
		in.close();
	}

}
