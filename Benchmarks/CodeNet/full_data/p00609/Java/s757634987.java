
import java.io.*;

import java.util.*;
import java.math.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
import static java.lang.Character.*;

class AOJ1023 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int AN = sc.nextInt();
			int BN = sc.nextInt();
			int R = sc.nextInt();
			if(AN == 0 && BN == 0 && R == 0)
				return;
			int[] XA = new int[AN];
			int[] YA = new int[AN];
			for(int i = 0; i < AN; i++) {
				XA[i] = sc.nextInt();
				YA[i] = sc.nextInt();
			}
			int[] XB = new int[BN];
			int[] YB = new int[BN];
			for(int i = 0; i < BN; i++) {
				XB[i] = sc.nextInt();
				YB[i] = sc.nextInt();
			}
			int ret = 0;
			for(int i = 0; i < AN; i++)
				for(int j = 0; j < BN; j++)
					if(hypot(XA[i] - XB[j], YA[i] - YB[j]) <= 4 * R)
						ret++;
			System.out.println(ret);
		}
	}
}

public class Main {
	public static void main(String... args) {
		new AOJ1023().run();
	}

	public static void debug(Object... os) {
		System.err.println(java.util.Arrays.deepToString(os));
	}
}

class Scanner {
	final java.util.Scanner sc;

	public double nextDouble() {
		return Double.parseDouble(sc.next());
	}

	public Scanner(java.io.InputStream is) {
		this.sc = new java.util.Scanner(is);
	}

	public boolean hasNext() {
		return sc.hasNext();
	}

	public String next() {
		return sc.next();
	}

	public int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public String nextLine() {
		return sc.nextLine();
	}

	public long nextLong() {
		return Long.parseLong(sc.next());
	}
}