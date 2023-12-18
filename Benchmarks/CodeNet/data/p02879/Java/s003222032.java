import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int a = in.nextInt(), b = in.nextInt();
		if (a <= 9 && b <= 9) System.out.println(a*b);
		else System.out.println(-1);
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}