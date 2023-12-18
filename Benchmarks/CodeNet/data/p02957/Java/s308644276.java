import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int a = in.nextInt(), b = in.nextInt();
		
		if (Math.abs(a-b)%2 == 1) out.println("IMPOSSIBLE");
		else {
			int dif = Math.abs(a-b)/2;
			out.println(Math.max(a,b)-dif);
		}
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}