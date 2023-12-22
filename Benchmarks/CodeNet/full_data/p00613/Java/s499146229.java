
import java.io.*;

import java.util.*;
import java.math.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
import static java.lang.Character.*;

class AOJ1027 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int K = sc.nextInt();
			if(K == 0)
				return;
			int sum = 0;
			int N = K * (K - 1) / 2;
			for(int i = 0; i < N; i++)
				sum += sc.nextInt();
			System.out.println(sum / (K - 1));
		}
	}
}

public class Main {
	public static void main(String... args) {
		new AOJ1027().run();
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