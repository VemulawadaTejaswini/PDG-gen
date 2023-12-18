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
	
	static class Pair implements Comparable<Pair>
	{
		int x,f;
		Pair(int x,int f)
		{
			this.x=x;
			this.f=f;
		}
		public int compareTo(Pair p)
		{
			return -(this.f-p.f);
		}
	}

	public static void main(String[] args) {

		int n=in.nextInt();
		Map<Integer, Integer> map1=new HashMap<>();
		Map<Integer, Integer> map2=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int x=in.nextInt();
			if(i%2==0)
			{
				if(map1.containsKey(x))
					map1.put(x, map1.get(x)+1);
				else
					map1.put(x, 1);
			}
			else
			{
				if(map2.containsKey(x))
					map2.put(x, map2.get(x)+1);
				else
					map2.put(x, 1);
			}
		}
		Pair[] p1=new Pair[map1.keySet().size()];
		Pair[] p2=new Pair[map2.keySet().size()];
		int ptr=0;
		for(int x : map1.keySet())
		{
			p1[ptr++]=new Pair(x, map1.get(x));
		}
		ptr=0;
		for(int x : map2.keySet())
		{
			p2[ptr++]=new Pair(x, map2.get(x));
		}
		Arrays.sort(p1);
		Arrays.sort(p2);
		if(p1[0].f==(n+1)/2&&p2[0].f==n/2)
		{
			if(p1[0].x==p2[0].x)
				out.println(n/2);
			else
				out.println(0);
			out.flush();
			return;
		}
		if(p1[0].x!=p2[0].x)
		{
			int ans1=(n+1)/2-p1[0].f;
			int ans2=n/2-p2[0].f;
			out.println(ans1+ans2);
			out.flush();
			return;
		}
		int ans1=(n+1)/2-p1[0].f;
		int ans2=n/2-((p2.length>1)?p2[1].f:0);
		int ans3=(n+1)/2-((p1.length>1)?p1[1].f:0);
		int ans4=n/2-p2[0].f;
		out.println(min(ans1+ans2, ans3+ans4));
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


