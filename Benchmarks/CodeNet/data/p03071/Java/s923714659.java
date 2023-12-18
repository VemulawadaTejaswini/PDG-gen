import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int a = in.nextInt(), b = in.nextInt();
		int[] ar = {a+a-1, b+b-1, a+b};
		Arrays.sort(ar);
		out.println(ar[2]);
		
	}
	
	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}