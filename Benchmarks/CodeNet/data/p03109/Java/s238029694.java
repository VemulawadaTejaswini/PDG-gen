import java.util.*;
import java.io.*;
import java.text.*;

class Main {

	void solve() {

		String s = in.next();
		int y = Integer.parseInt(s.substring(0, 4));
		int m = Integer.parseInt(s.substring(5, 7));
		int d = Integer.parseInt(s.substring(8, 10));
		
		if (y > 2019) {
			out.println("TBD");
			return;
		}
		
		if (m > 4) {
			out.println("TBD");
			return;
		}
		
		out.println("Heisei");
		
	}
	
	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}