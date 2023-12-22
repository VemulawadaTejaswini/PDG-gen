
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
			P[] A = new P[AN];
			for(int i = 0; i < AN; i++)
				A[i] = new P(sc.nextInt(), sc.nextInt());
			P[] B = new P[BN];
			for(int i = 0; i < BN; i++)
				B[i] = new P(sc.nextInt(), sc.nextInt());
			sort(A);
			sort(B);
			int ret = 0;
			for(int i = 0, j = 0; i < AN; i++) {
				while(j < BN && A[i].x - 4 * R > B[j].x)
					j++;
				for(int k = j; k < BN && B[k].x <= A[i].x + 4 * R; k++)
					if(A[i].dist(B[k]) <= 4 * R)
						ret++;
			}
			System.out.println(ret);
		}
	}
	class P implements Comparable<P> {
		final int x, y;

		public P(int x, int y) {
			this.x = x;
			this.y = y;
		}

		double dist(P p) {
			return hypot(x - p.x, y - p.y);
		}

		@Override
		public int compareTo(P o) {
			return x - o.x;
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