import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Main {
	InputStream is;
	PrintWriter out;
	String INPUT = "";

	void solve() 
	{
		char[] s = ns().toCharArray();
		char[] t = ns().toCharArray();
		boolean[] fs = new boolean[26];
		for(char c : s) fs[c - 'a'] = true;
		for(int i = 0; i < t.length; i++) {
			if(!fs[t[i] - 'a']) {
				out.println(-1);
				return;
			}
		}
		long ct = 0; 
		int arg = -1;
		/*Map<Character, List<Integer>> map = new HashMap<>();
		for(int i = 0; i < s.length; i++) {
			if(!map.containsKey(s[i])) map.put(s[i], new ArrayList<>());
			map.get(s[i]).add(i);
		}
		for(int i = 0; i < t.length; i++) {
			List<Integer> list = map.get(s[i]);
			for(int j = 0; j < list.size(); j++) {
				
			}
		}*/
		
		Map<Character, TreeSet<Integer>> map = new HashMap<>();
		for(int i = 0; i < s.length; i++) {
			if(!map.containsKey(s[i])) map.put(s[i], new TreeSet<>());
			map.get(s[i]).add(i);
		}
		for(int i = 0; i < t.length; i++) {
			TreeSet<Integer> set = map.get(t[i]);
			Integer v = set.higher(arg);
			//tr(v);
			if(v == null) {
				ct++;
				arg = set.first();
			}
			else {
				arg = v;
			}
		}
		out.println(s.length * ct + (arg + 1));
		
	}
	
					
	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private float nf() {
		return Float.parseFloat(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}