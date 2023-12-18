import java.io.*;
import java.math.*;
import java.util.*;

import static java.util.Arrays.fill;
import static java.lang.Math.*;
import static java.util.Arrays.sort;
import static java.util.Collections.sort;

public class Main {
	static int mod = 1000000007;
	static InputReader in = new InputReader(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {

		int n=in.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		int[] h=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=in.nextInt();
			y[i]=in.nextInt();
			h[i]=in.nextInt();
		}
		for(int cx=0;cx<=100;cx++)
		{
			for(int cy=0;cy<=100;cy++)
			{
				int maxi=mod;
				Set<Integer> set=new HashSet<>();
				for(int i=0;i<n;i++)
				{
					if(h[i]==0)
						maxi=min(maxi, abs(x[i]-cx)+abs(y[i]-cy));
					else
						set.add(abs(x[i]-cx)+abs(y[i]-cy)+h[i]);
					if(set.size()>1)
						break;
				}
				if(set.size()==1)
				{
					int val=-1;
					for(int i : set)
						val=i;
					if(val<=maxi)
					{
						System.out.println(cx+" "+cy+" "+val);
						return;
					}
				}
			}
		}
		out.close();

	}

	static class InputReader {
		private final InputStream stream;
		private final byte[] buf = new byte[8192];
		private int curChar, snumChars;

		public InputReader(InputStream st) {
			this.stream = st;
		}

		public int read() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public String readString() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
	}

	private static void tr(Object... o) {
		if (!(System.getProperty("ONLINE_JUDGE") != null))
			System.out.println(Arrays.deepToString(o));
	}
}


