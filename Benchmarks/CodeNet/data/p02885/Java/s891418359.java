import java.util.*;
import java.io.*;

class Main {

	void solve () {

		System.out.println(Math.max(in.nextInt()-in.nextInt()*2, 0));
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}