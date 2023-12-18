import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static PrintWriter out;
	static void solve() {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int ans1 = a + b;
		int ans2 = b + c;
		int ans3 = c + a;
		int answer = Math.min(Math.min(ans1, ans2), ans3);
		out.println(answer);		
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
