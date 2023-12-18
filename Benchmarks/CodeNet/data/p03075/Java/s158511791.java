import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), e = in.nextInt();
		int k = in.nextInt();
		
		out.println(e-a<=k ? "Yay!" : ":(");
		
		
	}
	
	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}