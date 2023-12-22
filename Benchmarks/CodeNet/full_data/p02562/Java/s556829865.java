import java.util.*;
import java.io.*;
import java.math.*;
import java.util.function.*;
public class Main implements Runnable {
	static boolean DEBUG;
	public static void main(String[] args) {
		DEBUG = args.length > 0 && args[0].equals("-DEBUG");
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> { e.printStackTrace(); System.exit(1); });
		new Thread(null, new Main(), "", 1 << 31).start();
	}

	public void run() {
		Solver solver = new Solver();
		solver.solve();
		solver.exit();
	}

	static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int pointer = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if(pointer < buflen) return true;
			else {
				pointer = 0;
				try {
					buflen = in.read(buffer);
				}catch (IOException e) {
					e.printStackTrace();
				}
				return buflen > 0;
			}
		}
		private int readByte() { if(hasNextByte()) return buffer[pointer ++]; else return -1; }
		private boolean isPrintableChar(int c) { return isPrintableChar(c, false); }
		private boolean isPrintableChar(int c, boolean includingSpace) { return (includingSpace ? 32 : 33) <= c && c <= 126; }
		private void skipUnprintable() { skipUnprintable(false); }
		private void skipUnprintable(boolean includingSpace) { while(hasNextByte() && !isPrintableChar(buffer[pointer], includingSpace)) pointer++; }
		private boolean hasNext() { return hasNext(false); }
		private boolean hasNext(boolean includingSpace) { skipUnprintable(includingSpace); return hasNextByte(); }
		private StringBuilder sb = new StringBuilder();
		public String next() { return next(false); }
		public String next(boolean includingSpace) {
			if(!hasNext(includingSpace)) throw new NoSuchElementException();
			sb.setLength(0);
			int b = readByte();
			while(isPrintableChar(b, includingSpace)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public long nextLong() {
			if(!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if(b == '-') {
				minus = true;
				b = readByte();
			}
			if(b < '0' || '9' < b) throw new NumberFormatException();
			while(true) {
				if('0' <= b && b <= '9') n = n * 10 + b - '0';
				else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
				else throw new NumberFormatException();
				b = readByte();
			}
		}
	}

	static class Solver {
		FastScanner sc = new FastScanner();
		public Solver() { }

		String ns() { return ns(false); }
		String ns(boolean includingSpace) { return sc.next(includingSpace); }
		String[] ns(int n) { return ns(n, false); }
		String[] ns(int n, boolean includingSpace) {
			String a[] = new String[n];
			for(int i = 0; i < n; i ++) a[i] = ns(includingSpace);
			return a;
		}
		String[][] ns(int n, int m) { return ns(n, m, false); }
		String[][] ns(int n, int m, boolean includingSpace) {
			String a[][] = new String[n][m];
			for(int i = 0; i < n; i ++) a[i] = ns(m, includingSpace);
			return a;
		}
		char nc() { return ns().charAt(0); }
		char[] nc(int n) {
			String str = ns();
			if(n < 0) n = str.length();
			char a[] = new char[n];
			for(int i = 0; i < n; i ++) a[i] = str.charAt(i);
			return a;
		}
		char[][] nc(int n, int m) {
			char a[][] = new char[n][m];
			for(int i = 0; i < n; i ++) a[i] = nc(m);
			return a;
		}
		boolean[] nb(int n, char t) {
			char c[] = nc(-1);
			if(n < 0) n = c.length;
			boolean a[] = new boolean[n];
			for(int i = 0; i < n; i ++) a[i] = c[i] == t;
			return a;
		}
		boolean[][] nb(int n, int m, char t) {
			boolean a[][] = new boolean[n][m];
			for(int i = 0; i < n; i ++) a[i] = nb(m, t);
			return a;
		}
		int ni() { return Math.toIntExact(sc.nextLong()); }
		int[] ni(int n) {
			int a[] = new int[n];
			for(int i = 0; i < n; i ++) a[i] = ni();
			return a;
		}
		int[][] ni(int n, int m) {
			int a[][] = new int[n][m];
			for(int i = 0; i < n; i ++) a[i] = ni(m);
			return a;
		}
		long nl() { return sc.nextLong(); }
		long[] nl(int n) {
			long a[] = new long[n];
			for(int i = 0; i < n; i ++) a[i] = nl();
			return a;
		}
		long[][] nl(int n, int m) {
			long a[][] = new long[n][m];
			for(int i = 0; i < n; i ++) a[i] = nl(m);
			return a;
		}
		double nd() { return Double.parseDouble(sc.next()); }
		double[] nd(int n) {
			double a[] = new double[n];
			for(int i = 0; i < n; i ++) a[i] = nd();
			return a;
		}
		double[][] nd(int n, int m) {
			double a[][] = new double[n][m];
			for(int i = 0; i < n; i ++) a[i] = nd(m);
			return a;
		}

		String booleanToString(boolean b) { return b ? "#" : "."; }

		PrintWriter out = new PrintWriter(System.out);
		PrintWriter err = new PrintWriter(System.err);
		StringBuilder sb4prtln = new StringBuilder();
		void prt() { out.print(""); }
		<T> void prt(T a) { out.print(a); }
		void prtln() { out.println(""); }
		<T> void prtln(T a) { out.println(a); }
		void prtln(int... a) {
			sb4prtln.setLength(0);
			for(int element : a) sb4prtln.append(element+" ");
			prtln(sb4prtln.toString().trim());
		}
		void prtln(long... a) {
			sb4prtln.setLength(0);
			for(long element : a) sb4prtln.append(element+" ");
			prtln(sb4prtln.toString().trim());
		}
		void prtln(double... a) {
			sb4prtln.setLength(0);
			for(double element : a) sb4prtln.append(element+" ");
			prtln(sb4prtln.toString().trim());
		}
		void prtln(String... a) {
			sb4prtln.setLength(0);
			for(String element : a) sb4prtln.append(element+" ");
			prtln(sb4prtln.toString().trim());
		}
		void prtln(char... a) {
			sb4prtln.setLength(0);
			for(char element : a) sb4prtln.append(element);
			prtln(sb4prtln.toString());
		}
		void prtln(boolean... a) {
			sb4prtln.setLength(0);
			for(boolean element : a) sb4prtln.append(booleanToString(element));
			prtln(sb4prtln.toString());
		}
		void prtln(int[][] a) { for(int[] element : a) prtln(element); }
		void prtln(long[][] a) { for(long[] element : a) prtln(element); }
		void prtln(double[][] a) { for(double[] element : a) prtln(element); }
		void prtln(String[][] a) { for(String[] element : a) prtln(element); }
		void prtln(char[][] a) { for(char[] element : a) prtln(element); }
		void prtln(boolean[][] a) { for(boolean[] element : a) prtln(element); }

		String errconvert(int a) { return isINF(a) ? "_" : String.valueOf(a); }
		String errconvert(long a) { return isINF(a) ? "_" : String.valueOf(a); }
		void errprt(int a) { if(DEBUG) err.print(errconvert(a)); }
		void errprt(long a) { if(DEBUG) err.print(errconvert(a)); }
		void errprt() { if(DEBUG) err.print(""); }
		<T> void errprt(T a) { if(DEBUG) err.print(a); }
		void errprt(boolean a) { if(DEBUG) errprt(booleanToString(a)); }
		void errprtln() { if(DEBUG) err.println(""); }
		void errprtln(int a) { if(DEBUG) err.println(errconvert(a)); }
		void errprtln(long a) { if(DEBUG) err.println(errconvert(a)); }
		<T> void errprtln(T a) { if(DEBUG) err.println(a); }
		void errprtln(boolean a) { if(DEBUG) errprtln(booleanToString(a)); }
		void errprtln(int... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(int element : a) sb4prtln.append(errconvert(element)+" ");
				errprtln(sb4prtln.toString().trim());
			}
		}
		void errprtln(long... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(long element : a) sb4prtln.append(errconvert(element)+" ");
				errprtln(sb4prtln.toString().trim());
			}
		}
		void errprtln(double... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(double element : a) sb4prtln.append(element+" ");
				errprtln(sb4prtln.toString().trim());
			}
		}
		void errprtln(String... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(String element : a) sb4prtln.append(element+" ");
				errprtln(sb4prtln.toString().trim());
			}
		}
		void errprtln(char... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(char element : a) sb4prtln.append(element);
				errprtln(sb4prtln.toString());
			}
		}
		void errprtln(boolean... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(boolean element : a) sb4prtln.append(booleanToString(element));
				errprtln(sb4prtln.toString());
			}
		}
		void errprtln(Object[] a) { if(DEBUG) for(Object element : a) errprtln(element); }
		void errprtln(int[][] a) { if(DEBUG) for(int[] element : a) errprtln(element); }
		void errprtln(long[][] a) { if(DEBUG) for(long[] element : a) errprtln(element); }
		void errprtln(double[][] a) { if(DEBUG) for(double[] element : a) errprtln(element); }
		void errprtln(String[][] a) { if(DEBUG) for(String[] element : a) errprtln(element); }
		void errprtln(char[][] a) { if(DEBUG) for(char[] element : a) errprtln(element); }
		void errprtln(boolean[][] a) { if(DEBUG) for(boolean[] element : a) errprtln(element); }
		void errprtln(Object[][] a) { if(DEBUG) for(Object element : a) { errprtln(element); errprtln(); } }

		void reply(boolean b) { prtln(b ? "Yes" : "No"); }
		void REPLY(boolean b) { prtln(b ? "YES" : "NO"); }

		void flush() { out.flush(); if(DEBUG) err.flush(); }
		void assertion(boolean b) { if(!b) { flush(); throw new AssertionError(); } }

		void exit() { flush(); System.exit(0); }
		<T> void exit(T a) { prtln(a); exit(); }
		void exit(int... a) { prtln(a); exit(); }
		void exit(long... a) { prtln(a); exit(); }
		void exit(double... a) { prtln(a); exit(); }
		void exit(String... a) { prtln(a); exit(); }
		void exit(char... a) { prtln(a); exit(); }
		void exit(boolean... a) { prtln(a); exit(); }
		void exit(int[][] a) { prtln(a); exit(); }
		void exit(long[][] a) { prtln(a); exit(); }
		void exit(double[][] a) { prtln(a); exit(); }
		void exit(String[][] a) { prtln(a); exit(); }
		void exit(char[][] a) { prtln(a); exit(); }
		void exit(boolean[][] a) { prtln(a); exit(); }


		final long INF = (long)1e18 + 7;
		boolean isPlusINF(long a) { return a > INF / 10; }
		boolean isMinusINF(long a) { return isPlusINF(- a); }
		boolean isINF(long a) { return isPlusINF(a) || isMinusINF(a); }
		final int I_INF = (int)1e9 + 7;
		boolean isPlusINF(int a) { return a > I_INF / 10; }
		boolean isMinusINF(int a) { return isPlusINF(- a); }
		boolean isINF(int a) { return isPlusINF(a) || isMinusINF(a); }


		int min(int a, int b) { return Math.min(a, b); }
		long min(long a, long b) { return Math.min(a, b); }
		double min(double a, double b) { return Math.min(a, b); }
		<T extends Comparable<T>> T min(T a, T b) { return a.compareTo(b) <= 0 ? a : b; }
		int min(int... x) {
			int min = x[0];
			for(int val : x) min = min(min, val);
			return min;
		}
		long min(long... x) {
			long min = x[0];
			for(long val : x) min = min(min, val);
			return min;
		}
		double min(double... x) {
			double min = x[0];
			for(double val : x) min = min(min, val);
			return min;
		}
		int max(int a, int b) { return Math.max(a, b); }
		long max(long a, long b) { return Math.max(a, b); }
		double max(double a, double b) { return Math.max(a, b); }
		<T extends Comparable<T>> T max(T a, T b) { return a.compareTo(b) >= 0 ? a : b; }
		int max(int... x) {
			int max = x[0];
			for(int val : x) max = max(max, val);
			return max;
		}
		long max(long... x) {
			long max = x[0];
			for(long val : x) max = max(max, val);
			return max;
		}
		double max(double... x) {
			double max = x[0];
			for(double val : x) max = max(max, val);
			return max;
		}
		<T extends Comparable<T>> T max(T[] x) {
			T max = x[0];
			for(T val : x) max = max(max, val);
			return max;
		}
		int max(int[][] a) {
			int max = a[0][0];
			for(int[] ele : a) max = max(max, max(ele));
			return max;
		}
		long max(long[][] a) {
			long max = a[0][0];
			for(long[] ele : a) max = max(max, max(ele));
			return max;
		}
		double max(double[][] a) {
			double max = a[0][0];
			for(double[] ele : a) max = max(max, max(ele));
			return max;
		}
		<T extends Comparable<T>> T max(T[][] a) {
			T max = a[0][0];
			for(T[] ele : a) max = max(max, max(ele));
			return max;
		}
		long sum(int... a) {
			long sum = 0;
			for(int element : a) sum += element;
			return sum;
		}
		long sum(long... a) {
			long sum = 0;
			for(long element : a) sum += element;
			return sum;
		}
		double sum(double... a) {
			double sum = 0;
			for(double element : a) sum += element;
			return sum;
		}
		long sum(boolean... a) {
			long sum = 0;
			for(boolean element : a) sum += element ? 1 : 0;
			return sum;
		}
		long[] sums(int[] a) {
			long sum[] = new long[a.length + 1];
			sum[0] = 0;
			for(int i = 0; i < a.length; i ++) sum[i + 1] = sum[i] + a[i];
			return sum;
		}
		long[] sums(long[] a) {
			long sum[] = new long[a.length + 1];
			sum[0] = 0;
			for(int i = 0; i < a.length; i ++) sum[i + 1] = sum[i] + a[i];
			return sum;
		}
		double[] sums(double[] a) {
			double sum[] = new double[a.length + 1];
			sum[0] = 0;
			for(int i = 0; i < a.length; i ++) sum[i + 1] = sum[i] + a[i];
			return sum;
		}
		long[] sums(boolean[] a) {
			long sum[] = new long[a.length + 1];
			sum[0] = 0;
			for(int i = 0; i < a.length; i ++) sum[i + 1] = sum[i] + (a[i] ? 1 : 0);
			return sum;
		}
		long[][] sums(int[][] a) {
			long sum[][] = new long[a.length + 1][a[0].length + 1];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				for(int j = 0; j < a[i].length; j ++) {
					sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + a[i][j];
				}
			}
			return sum;
		}
		long[][] sums(long[][] a) {
			long sum[][] = new long[a.length + 1][a[0].length + 1];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				for(int j = 0; j < a[i].length; j ++) {
					sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + a[i][j];
				}
			}
			return sum;
		}
		double[][] sums(double[][] a) {
			double sum[][] = new double[a.length + 1][a[0].length + 1];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				for(int j = 0; j < a[i].length; j ++) {
					sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + a[i][j];
				}
			}
			return sum;
		}
		long[][] sums(boolean[][] a) {
			long sum[][] = new long[a.length + 1][a[0].length + 1];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				for(int j = 0; j < a[i].length; j ++) {
					sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + (a[i][j] ? 1 : 0);
				}
			}
			return sum;
		}
		int constrain(int x, int l, int r) { return min(max(x, min(l, r)), max(l, r)); }
		long constrain(long x, long l, long r) { return min(max(x, min(l, r)), max(l, r)); }
		double constrain(double x, double l, double r) { return min(max(x, min(l, r)), max(l, r)); }
		int abs(int x) { return x >= 0 ? x : - x; }
		long abs(long x) { return x >= 0 ? x : - x; }
		double abs(double x) { return x >= 0 ? x : - x; }
		int signum(int x) { return x > 0 ? 1 : x < 0 ? -1 : 0; }
		int signum(long x) { return x > 0 ? 1 : x < 0 ? -1 : 0; }
		int signum(double x) { return x > 0 ? 1 : x < 0 ? -1 : 0; }
		long round(double x) { return Math.round(x); }
		long floor(double x) { return (long)Math.floor(x); }
		int divfloor(int a, int b) { return signum(a) == signum(b) ? a / b : - divceil(abs(a), abs(b)); }
		long divfloor(long a, long b) { return signum(a) == signum(b) ? a / b : - divceil(abs(a), abs(b)); }
		long ceil(double x) { return (long)Math.ceil(x); }
		int divceil(int a, int b) { return a >= 0 && b > 0 ? (a + b - 1) / b
											: a < 0 && b < 0 ? divceil(abs(a), abs(b))
											: - divfloor(abs(a), abs(b)); }
		long divceil(long a, long b) { return a >= 0 && b > 0 ? (a + b - 1) / b
											: a < 0 && b < 0 ? divceil(abs(a), abs(b))
											: - divfloor(abs(a), abs(b)); }
		double sqrt(int x) { return Math.sqrt((double)x); }
		double sqrt(long x) { return Math.sqrt((double)x); }
		double sqrt(double x) { return Math.sqrt(x); }
		long fact(int n) {
			long ans = 1;
			for(int i = 1; i <= n; i ++) ans = Math.multiplyExact(ans, i);
			return ans;
		}
		double pow(double x, double y) { return Math.pow(x, y); }
		long pow(long x, long y) {
			long ans = 1;
			while(true) {
				if(y % 2 != 0) ans = Math.multiplyExact(ans, x);
				y /= 2;
				if(y <= 0) return ans;
				x = Math.multiplyExact(x, x);
			}
		}
		int gcd(int a, int b) {
			while(true) {
				if(b == 0) return a;
				int tmp = a;
				a = b;
				b = tmp % b;
			}
		}
		long gcd(long a, long b) {
			while(true) {
				if(b == 0) return a;
				long tmp = a;
				a = b;
				b = tmp % b;
			}
		}
		long lcm(long a, long b) { return a / gcd(a, b) * b; }
		int gcd(int... a) {
			int gcd = 0;
			for(int i = 0; i < a.length; i ++) gcd = gcd(gcd, a[i]);
			return gcd;
		}
		long gcd(long... a) {
			long gcd = 0;
			for(int i = 0; i < a.length; i ++) gcd = gcd(gcd, a[i]);
			return gcd;
		}
		double random() { return Math.random(); }
		int random(int max) { return (int)floor(random() * max); }
		long random(long max) { return floor(random() * max); }
		double random(double max) { return random() * max; }
		int random(int min, int max) { return random(max - min) + min; }
		long random(long min, long max) { return random(max - min) + min; }
		double random(double min, double max) { return random(max - min) + min; }

		boolean isUpper(char a) { return a >= 'A' && a <= 'Z'; }
		boolean isLower(char a) { return a >= 'a' && a <= 'z'; }
		int upperToInt(char a) { return a - 'A'; }
		int lowerToInt(char a) { return a - 'a'; }
		int numToInt(char a) { return a - '0'; }
		int charToInt(char a) { return a >= 'a' ? lowerToInt(a) : a >= 'A' ? upperToInt(a) : numToInt(a); }
		char intToUpper(int a) { return (char)(a + 'A'); }
		char intToLower(int a) { return (char)(a + 'a'); }
		char intToNum(int a) { return (char)(a + '0'); }
		int[] charToInt(char[] a) {
			int array[] = new int[a.length];
			for(int i = 0; i < a.length; i ++) array[i] = charToInt(a[i]);
			return array;
		}

		int numDigits(long a) { return Long.toString(a).length(); }
		long bitFlag(int a) { return 1L << (long)a; }
		boolean isFlagged(long x, int a) { return (x & bitFlag(a)) != 0; }

		long countString(String str, String a) { return (str.length() - str.replace(a, "").length()) / a.length(); }
		long countStringAll(String str, String a) { return str.length() - str.replaceAll(a, "").length(); }

		void fill(int[] array, int x) { Arrays.fill(array, x); }
		void fill(long[] array, long x) { Arrays.fill(array, x); }
		void fill(double[] array, double x) { Arrays.fill(array, x); }
		void fill(char[] array, char x) { Arrays.fill(array, x); }
		void fill(boolean[] array, boolean x) { Arrays.fill(array, x); }
		void fill(int[][] array, int x) { for(int[] a : array) fill(a, x); }
		void fill(long[][] array, long x) { for(long[] a : array) fill(a, x); }
		void fill(double[][] array, double x) { for(double[] a : array) fill(a, x); }
		void fill(char[][] array, char x) { for(char[] a : array) fill(a, x); }
		void fill(boolean[][] array, boolean x) { for(boolean[] a : array) fill(a, x); }
		void fill(int[][][] array, int x) { for(int[][] a : array) fill(a, x); }
		void fill(long[][][] array, long x) { for(long[][] a : array) fill(a, x); }
		void fill(double[][][] array, double x) { for(double[][] a : array) fill(a, x); }
		void fill(char[][][] array, char x) { for(char[][] a : array) fill(a, x); }
		void fill(boolean[][][] array, boolean x) { for(boolean[][] a : array) fill(a, x); }



		// graph
		class Graph {
			int numNode;
			int numEdge;
			boolean directed;
			Set<Edge> edges = new HashSet<>();
			Node nodes[];
			Node reversedNodes[];

			Graph(int numNode, int numEdge, boolean directed) {
				this.numNode = numNode;
				this.numEdge = numEdge;
				this.directed = directed;
				nodes = new Node[numNode];
				reversedNodes = new Node[numNode];
				for(int i = 0; i < numNode; i ++) {
					nodes[i] = new Node(i);
					reversedNodes[i] = new Node(i);
				}
			}

			void init(Set<Edge> edges) {
				this.edges = edges;
				for(Edge e : edges) add(e);
			}

			void add(Edge e) {
				edges.add(e);
				nodes[e.source].add(e.target, e.cost);
				if(directed) reversedNodes[e.target].add(e.source, e.cost);
				else nodes[e.target].add(e.source, e.cost);
			}

			void remove(Edge e) {
				edges.remove(e);
				nodes[e.source].remove(e.target, e.cost);
				if(directed) reversedNodes[e.target].remove(e.source, e.cost);
				else nodes[e.target].remove(e.source, e.cost);
			}

			void update(Edge e, long cost) {
				nodes[e.source].update(e.target, cost);
				if(directed) reversedNodes[e.target].update(e.source, cost);
				else nodes[e.target].update(e.source, cost);
				e.cost = cost;
			}
			void update(int source, int target, long cost) { update(new Edge(source, target, cost), cost); }

			void clearNodes() {
				for(Node n : nodes) n.clear();
				for(Node n : reversedNodes) n.clear();
			}
		}

		class Node extends HashSet<Edge> {
			int id;

			Node(int id) { this.id = id; }
			void add(int target, long cost) { add(new Edge(id, target, cost)); }
			void remove(int target, long cost) { remove(new Edge(id, target, cost)); }
			void update(int target, long cost) { remove(target, cost); add(target, cost); }
		}

		class Edge implements Comparable<Edge> {
			int source;
			int target;
			long cost;
			Edge(int source, int target, long cost) {
				this.source = source;
				this.target = target;
				this.cost = cost;
			}


			@Override
			public String toString() { return source+" - "+cost+" -> "+target; }
			@Override
			public int hashCode() { return Objects.hash(source, target); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				Edge that = (Edge) obj;
				if(this.source != that.source) return false;
				if(this.target != that.target) return false;
				return true;
			}
			@Override
			public int compareTo(Edge that) {
				int c = Long.compare(this.cost, that.cost);
				if(c == 0) c = Integer.compare(this.source, that.source);
				if(c == 0) c = Integer.compare(this.target, that.target);
				return c;
			}
		}

		class PairLL implements Comparable<PairLL> {
			long a; long b;
			PairLL() { }
			PairLL(long a, long b) { this.a = a; this.b = b; }
			@Override public String toString() { return "("+a+", "+b+")"; }
			@Override public int hashCode() { return Objects.hash(a, b); }
			@Override
			public boolean equals(Object obj) {
				if(this == obj) return true;
				if(obj == null) return false;
				if(this.getClass() != obj.getClass()) return false;
				PairLL that = (PairLL) obj;
				if(this.a != that.a || this.b != that.b) return false;
				return true;
			}
			@Override
			public int compareTo(PairLL that) {
				int c = Long.compare(this.a, that.a);
				if(c == 0) c = Long.compare(this.b, that.b);
				return c;
			}
		}

public void solve() {
	int num = ni();
	int kk = ni();
	long a[][] = nl(num, num);

	int numNode = num * 2 + 1;
	long d[] = new long[numNode];
	for(int i = 0; i < num; i ++) {
		d[i] = kk;
		d[num + i] = - kk;
	}
	NormalizedMinCostFlow nmcf = new NormalizedMinCostFlow(numNode, d);
	for(int i = 0; i < num; i ++) {
		for(int j = 0; j < num; j ++) {
			nmcf.addEdge(i, num + j, 1, - a[i][j]);
		}
	}
	for(int i = 0; i < num; i ++) {
		nmcf.addEdge(i, numNode - 1, INF, 0);
		nmcf.addEdge(numNode - 1, num + i, INF, 0);
	}
	PairLL ans = nmcf.minCostFlow();
	prtln(- ans.b);
	char c[][] = new char[num][num];
	fill(c, '.');
	for(MinCostFlow.WeightedCapEdge e : nmcf.edgesList) {
		if(e.source >= num * 2 || e.target >= num * 2 || e.source < e.target) continue;
		if(e.getFlow() == 0) c[e.target][e.source - num] = 'X';
	}
	prtln(c);
}

// WeightedCapEdge(source, target, cap, cost)
// PairLL(flow, cost)
class NormalizedMinCostFlow extends MinCostFlow { // V=numNode, E=numEdge, F=in
	long in;
	long sum;
	int s;
	int t;
	long d[];
	int idx[];
	int tsIdx;
	NormalizedMinCostFlow(int numNode, long[] d) { // O(V)
		super(numNode + 2);
		this.d = d;
		in = 0;
		sum = 0;
		s = numNode;
		t = numNode + 1;
		idx = new int[numNode];

		for(int i = 0; i < numNode; i++) {
			if(d[i] >= 0) {
				idx[i] = super.addEdge(s, i, d[i], 0);
				super.addEdge(i, t, 0, 0);
				in += d[i];
			}else {
				super.addEdge(s, i, 0, 0);
				idx[i] = super.addEdge(i, t, - d[i], 0);
			}
		}
	}

	void addDemand(int i, long addD) { if(i >= d.length) return; changeDemand(i, d[i] + addD); } // O(1)
	void changeDemand(int i, long newD) { // O(1)
		if(i >= d.length) return;
		if(d[i] > 0) in -= d[i];
		edgesList.get(idx[i]).cap = 0;
		d[i] = newD;
		if(d[i] >= 0) idx[i] &= ~1; else idx[i] |= 1;
		if(d[i] > 0) in += d[i];
		edgesList.get(idx[i]).cap = abs(d[i]);
	}

	int addEdge(int source, int target, long cap, long cost) { return addEdge(source, target, 0, cap, cost); } // O(1)
	int addEdge(int source, int target, long minCap, long maxCap, long cost) { // O(1)
		if(cost < 0) {
			sum += cost * maxCap;
			addDemand(source, - maxCap);
			addDemand(target, maxCap);
			return super.addEdge(target, source, maxCap - minCap, - cost);
		}else {
			sum += cost * minCap;
			addDemand(source, - minCap);
			addDemand(target, minCap);
			return super.addEdge(source, target, maxCap - minCap, cost);
		}
	}

	// O(F(V+E)logV)
	PairLL minCostFlow() {
		PairLL ans = minCostFlow(s, t, in);
		ans.b += sum;
		return ans;
	}
}


// WeightedCapEdge(source, target, cap, cost)
// PairLL(flow, cost)
class MinCostFlow { // V=numNode, E=numEdge
	class WeightedCapEdge {
		int source;
		int target;
		long cap;
		long cost;
		int rev;
		WeightedCapEdge(int source, int target, long cap, long cost, int rev) {
			this.source = source;
			this.target = target;
			this.cap = cap;
			this.cost = cost;
			this.rev = rev;
		}

		long getFlow() { return edges[target][rev].cap; }

		@Override
		public String toString() { return source+" - ("+cap+", "+cost+") -> "+target; }
		@Override
		public int hashCode() { return Objects.hash(source, target); }
		@Override
		public boolean equals(Object obj) {
			if(this == obj) return true;
			if(obj == null) return false;
			if(this.getClass() != obj.getClass()) return false;
			Edge that = (Edge) obj;
			if(this.source != that.source) return false;
			if(this.target != that.target) return false;
			return true;
		}
	}

	int numNode;
	int numEdge;
	List<WeightedCapEdge> edgesList;
	int len[];
	WeightedCapEdge edges[][];
	long potential[];

	MinCostFlow(int numNode) { // O(V)
		this.numNode = numNode;
		edgesList = new ArrayList<>();
		len = new int[numNode];
		edges = new WeightedCapEdge[numNode][];
		potential = new long[numNode];
		fill(potential, 0);
	}

	int addEdge(int source, int target, long cap, long cost) { // O(1)
		WeightedCapEdge e = new WeightedCapEdge(source, target, cap, cost, len[target]);
		len[source] ++;
		len[target] ++;
		edgesList.add(e);
		return numEdge ++;
	}

	void init() { // O(E)
		for(int i = 0; i < numNode; i ++) edges[i] = new WeightedCapEdge[len[i]];
		int idx[] = new int[numNode];
		for(WeightedCapEdge e : edgesList) {
			edges[e.target][idx[e.target] ++] = new WeightedCapEdge(e.target, e.source, 0, - e.cost, idx[e.source]);
			edges[e.source][idx[e.source] ++] = e;
		}
	}
	void clearFlow() { // O(V+E)
		fill(potential, 0);
		for(WeightedCapEdge e : edgesList) {
			long flow = e.getFlow();
			e.cap += flow;
			edges[e.target][e.rev].cap -= flow;
		}
	}

	// O(f(V+E)logV)
	PairLL minCostMaxFlow(int s, int t) { return minCostFlow(s, t, INF); }
	PairLL minCostFlow(int s, int t, long flowLimit) {
		PairLL[] slope = minCostSlope(s, t, flowLimit);
		return slope[slope.length - 1];
	}
	PairLL[] minCostSlope(int s, int t) { return minCostSlope(s, t, INF); }
	PairLL[] minCostSlope(int s, int t, long flowLimit) {
		if(s == t) return null;
		init();
		List<PairLL> slopeList = new ArrayList<>();
		long prvCost = -1;
		long flow = 0;
		long cost = 0;
		while(true) {
			slopeList.add(new PairLL(flow, cost));
			PairLL add = dijkstra(s, t, flowLimit - flow);
			if(add.a == 0) break;
			flow += add.a;
			cost += add.a * add.b;
			if(add.b == prvCost) slopeList.remove(slopeList.size() - 1);
			prvCost = add.b;
		}
		PairLL slope[] = new PairLL[slopeList.size()];
		for(int i = 0; i < slopeList.size(); i ++) slope[i] = slopeList.get(i);
		return slope;
	}
	PairLL dijkstra(int s, int t, long maxFlow) { // O((V+E)logV)
		long dist[] = new long[numNode];
		fill(dist, INF);
		dist[s] = 0;
		WeightedCapEdge prv[] = new WeightedCapEdge[numNode];

		Queue<Edge> pq = new PriorityQueue<>();
		pq.add(new Edge(s, s, dist[s]));
		while(!pq.isEmpty()) {
			Edge crt = pq.poll();
			if(dist[crt.target] < crt.cost) continue;
			for(WeightedCapEdge e : edges[crt.target]) {
				if(e.cap <= 0) continue;
				long cost = dist[e.source] + e.cost + potential[e.source] - potential[e.target];
				if(dist[e.target] > cost) {
					dist[e.target] = cost;
					prv[e.target] = e;
					pq.add(new Edge(e.source, e.target, dist[e.target]));
				}
			}
		}
		if(dist[t] == INF) return new PairLL(0, INF);
		for(int i = 0; i < numNode; i ++) potential[i] += dist[i];
		PairLL add = new PairLL(maxFlow, 0);
		for(int v = t; v != s; ) {
			WeightedCapEdge e = prv[v];
			add.b += e.cost;
			add.a = min(add.a, e.cap);
			v = e.source;
		}
		for(int v = t; v != s;) {
			WeightedCapEdge e = prv[v];
			e.cap -= add.a;
			edges[v][e.rev].cap += add.a;
			v = e.source;
		}
		return add;
	}
}


	}
}
