import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int a = in.nextInt(), b = in.nextInt();
		int[] ar = {a+b, a-b, a*b};
		Arrays.sort(ar);
		out.println(ar[2]);
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}