import java.util.*;
import java.io.*;

class Main {

	void solve() {

		double t = in.nextDouble(), x = in.nextDouble();
		out.println(String.format("%.3f", t/x));
		
	}
	
	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}