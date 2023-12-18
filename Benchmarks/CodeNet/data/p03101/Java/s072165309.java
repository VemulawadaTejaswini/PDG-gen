import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int H = in.nextInt(), W = in.nextInt(), h = in.nextInt(), w = in.nextInt();
		out.println(H*W - (h*W + w*H - h*w));
		
		
	}
	
	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}