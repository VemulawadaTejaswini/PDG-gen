import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
		out.println(Math.min(n*a, b));
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}