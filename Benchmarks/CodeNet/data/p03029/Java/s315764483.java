import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int a = in.nextInt(), p = in.nextInt();
		p += a * 3;
		out.println(p/2);
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}