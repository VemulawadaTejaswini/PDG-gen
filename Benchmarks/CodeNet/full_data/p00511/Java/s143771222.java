
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		for(;;) {
			String s = sc.next();
			if(s.equals("+")) v += sc.nextInt();
			if(s.equals("-")) v -= sc.nextInt();
			if(s.equals("*")) v *= sc.nextInt();
			if(s.equals("/")) v /= sc.nextInt();
			if(s.equals("=")) break;
		}
		System.out.println(v);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}