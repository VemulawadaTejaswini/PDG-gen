
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	String[] change(String s, String rule, int x) {
		//System.out.println(s + " " + rule);
		if (s.length() < rule.length()) return new String[]{};
		
		ArrayList<String> res = new ArrayList<String>();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < rule.length(); j++) {
				char c1 = s.charAt((i+j) % s.length());
				char c2 = rule.charAt(j);
				if (c1 != c2) break;
				else if (j == rule.length() - 1) {
					String ss = s + s;
					String next = ss.substring((i+j+1), (i+j+1 + s.length() - rule.length())) + x;
					//System.out.println("changed! : " + next);
					res.add(next);
				}
			}
		}
		
		return res.toArray(new String[0]);
	}
	
	boolean commonCheck(HashSet<String> hash, String s) {
		String temp = s.toString();
		
		for (int i = 0; i < s.length(); i++) {
			if (hash.contains(temp)) return true;
			String t1 = temp.substring(1);
			char c1 = temp.charAt(0);
			temp = t1 + c1;
		}
		
		return false;
	}
	
	public void run() {
		while (true) {
			int n = in.nextInt(), m = in.nextInt(), r = in.nextInt();
			if ((n|m|r) == 0) break;
			
			String A = "", B = "";
			HashSet<String> aHash = new HashSet<String>();
			HashSet<String> bHash = new HashSet<String>();
			ArrayList<String> rule = new ArrayList<String>();
			ArrayList<Integer> ruleRes = new ArrayList<Integer>();
			
			for (int i = 0; i < n; i++) {
				int x = in.nextInt();
				A += x;
			}

			for (int i = 0; i < m; i++) {
				int x = in.nextInt();
				B += x;
			}
			
			for (int i = 0; i < r; i++) {
				int k = in.nextInt();
				String s = "";
				for (int j = 0; j < k; j++) {
					int c = in.nextInt();
					s += c;
				}
				rule.add(s);
				ruleRes.add(in.nextInt());
			}
			
			Stack<String> stack = new Stack<String>();
			stack.add(A);
			while (!stack.isEmpty()) {
				String s = stack.pop();
				if (aHash.contains(s)) continue;
				aHash.add(s);
				for (int i = 0; i < rule.size(); i++) {
					String[] changed = change(s, rule.get(i), ruleRes.get(i));
					for (int j = 0; j < changed.length; j++) {
						stack.add(changed[j]);
					}
				}
			}
			
			int res = -1;
			stack.add(B);
			while (!stack.isEmpty()) {
				String s = stack.pop();
				if (bHash.contains(s)) continue;
				bHash.add(s);
				
				if (commonCheck(aHash, s)) res = Math.max(res, s.length());
				
				for (int i = 0; i < rule.size(); i++) {
					String[] changed = change(s, rule.get(i), ruleRes.get(i));
					for (int j = 0; j < changed.length; j++) {
						stack.add(changed[j]);
					}
				}
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}