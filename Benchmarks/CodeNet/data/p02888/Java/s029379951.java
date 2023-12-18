
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main implements Runnable { // クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	/**
	 * for (int i = 0; i < N; i++) {} System.out.println(); HashMap<Integer,
	 * Integer> hm = new HashMap<>(); int[] s = new int[M]; ArrayDeque<Integer> deq
	 * = new ArrayDeque<>();
	 *
	 * 文字列のSort String sorted = S.chars() .sorted() .collect(StringBuilder::new,
	 * StringBuilder::appendCodePoint, StringBuilder::append) .toString(); for (char
	 * i = 'a'; i <= 'z'; i++) {}
	 * System.out.println("i:" + i + " ,j:" + j);
	 *
	 * あいうえお → い
	 * S.substring(1,2)
	 */
	public void run() {
		FastScannerMainD sc = new FastScannerMainD(System.in);

		try {
			int N = sc.nextInt();
			int[] L = new int[N];

			for (int i = 0; i < N; i++) {
				int ne = sc.nextInt();
				L[i] = ne;
			}

			/* 1. しゃくとり法 */
			Arrays.sort(L);

			//System.out.println(Arrays.toString(L));
			long ans = 0;
			for (int a = 0; a < N - 2; a++) {
				for (int b = a + 1; b < N - 1; b++) {
					//System.out.println("a = " + a + " ,b = " + b);
					int c = b + 1;
					//System.out.println("a+b = " + (L[a] + L[b]) + " ,c = " + L[c]);
					while (c < N && (L[a] + L[b]) > L[c]) {
						//	System.out.println("a = " + a + " ,b = " + b + ",c = " + c);
						//	System.out.println("a+b = " + (L[a] + L[b]) + " ,c = " + L[c]);
						c++;
						ans++;
					}
				}
			}
			System.out.println(ans);

			/*下記だとO(N^3)となるので、間に合わない
			List<List<Integer>> ret = Combination.combination(list, 3);
			
			int count = 0;
			for (int i = 0; i < ret.size(); i++) {
				System.out.println(ret.get(i));
				System.out.println(ret.get(i).get(0));
				System.out.println(ret.get(i).get(1));
				System.out.println(ret.get(i).get(2));
			
				int a = ret.get(i).get(0);
				int b = ret.get(i).get(1);
				int c = ret.get(i).get(2);
			
				if (a < b + c && b < a + c && c < a + b) {
					count++;
				}
			
			}
			
			System.out.println(count);
			*/

		} catch (

		ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 下記はオーバーフローでExceptionをキャッチするよう
	private long multiple(long a, long b) {
		long ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private int multiple(int a, int b) {
		int ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private long add(long a, long b) {
		long ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private int add(int a, int b) {
		int ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}
}

class Combination {

	/*
	public static void main(String[] args) {
		List list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		List ret = combination(list, 3);
		System.out.println(ret);
	}
	*/

	/**
	 *
	 * @param n
	 * @param m
	 * @return Combinationの数を返す
	 */
	static long calcCombination(int n, int m) {
		if (n < m || m < 0) {
			throw new IllegalArgumentException("引数の値が不正です ( n : " + n + ", m : " + m + ")");
		}
		long c = 1;
		m = (n - m < m ? n - m : m);
		for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
			c *= ns;
			c /= ms;
		}
		return c;
	}

	public static List<List<Integer>> combination(List list, int count) {
		List ret = new ArrayList<List<Integer>>();
		for (int i = 0; i < list.size(); i++) {
			if (i + count > list.size()) {
				break;
			}
			Stack stack = new Stack<Integer>();
			stack.push(list.get(i));
			_combination(ret, list, stack, i + 1, count);
		}
		return ret;
	}

	private static void _combination(List ret, List list, Stack stack, int index, int count) {
		for (int i = index; i < list.size(); i++) {
			stack.push(list.get(i));
			if (stack.size() == count) {
				ret.add(Arrays.asList(stack.toArray()));
				stack.pop();
				continue;
			}
			_combination(ret, list, stack, i + 1, count);
			stack.pop();
		}
	}

}

// 高速なScanner
class FastScannerMainD {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainD(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] package Atcoder.abc.contest143;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class MainD implements Runnable { // クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new MainD(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	/**
	 * for (int i = 0; i < N; i++) {} System.out.println(); HashMap<Integer,
	 * Integer> hm = new HashMap<>(); int[] s = new int[M]; ArrayDeque<Integer> deq
	 * = new ArrayDeque<>();
	 *
	 * 文字列のSort String sorted = S.chars() .sorted() .collect(StringBuilder::new,
	 * StringBuilder::appendCodePoint, StringBuilder::append) .toString(); for (char
	 * i = 'a'; i <= 'z'; i++) {}
	 * System.out.println("i:" + i + " ,j:" + j);
	 *
	 * あいうえお → い
	 * S.substring(1,2)
	 */
	public void run() {
		FastScannerMainD sc = new FastScannerMainD(System.in);

		try {
			int N = sc.nextInt();
			int[] L = new int[N];

			for (int i = 0; i < N; i++) {
				int ne = sc.nextInt();
				L[i] = ne;
			}

			/* 1. しゃくとり法 */
			Arrays.sort(L);

			//System.out.println(Arrays.toString(L));
			long ans = 0;
			for (int a = 0; a < N - 2; a++) {
				for (int b = a + 1; b < N - 1; b++) {
					//System.out.println("a = " + a + " ,b = " + b);
					int c = b + 1;
					//System.out.println("a+b = " + (L[a] + L[b]) + " ,c = " + L[c]);
					while (c < N && (L[a] + L[b]) > L[c]) {
						//	System.out.println("a = " + a + " ,b = " + b + ",c = " + c);
						//	System.out.println("a+b = " + (L[a] + L[b]) + " ,c = " + L[c]);
						c++;
						ans++;
					}
				}
			}
			System.out.println(ans);

			/*下記だとO(N^3)となるので、間に合わない
			List<List<Integer>> ret = Combination.combination(list, 3);
			
			int count = 0;
			for (int i = 0; i < ret.size(); i++) {
				System.out.println(ret.get(i));
				System.out.println(ret.get(i).get(0));
				System.out.println(ret.get(i).get(1));
				System.out.println(ret.get(i).get(2));
			
				int a = ret.get(i).get(0);
				int b = ret.get(i).get(1);
				int c = ret.get(i).get(2);
			
				if (a < b + c && b < a + c && c < a + b) {
					count++;
				}
			
			}
			
			System.out.println(count);
			*/

		} catch (

		ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 下記はオーバーフローでExceptionをキャッチするよう
	private long multiple(long a, long b) {
		long ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private int multiple(int a, int b) {
		int ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private long add(long a, long b) {
		long ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private int add(int a, int b) {
		int ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}
}

class Combination {

	/*
	public static void main(String[] args) {
		List list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		List ret = combination(list, 3);
		System.out.println(ret);
	}
	*/

	/**
	 *
	 * @param n
	 * @param m
	 * @return Combinationの数を返す
	 */
	static long calcCombination(int n, int m) {
		if (n < m || m < 0) {
			throw new IllegalArgumentException("引数の値が不正です ( n : " + n + ", m : " + m + ")");
		}
		long c = 1;
		m = (n - m < m ? n - m : m);
		for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
			c *= ns;
			c /= ms;
		}
		return c;
	}

	public static List<List<Integer>> combination(List list, int count) {
		List ret = new ArrayList<List<Integer>>();
		for (int i = 0; i < list.size(); i++) {
			if (i + count > list.size()) {
				break;
			}
			Stack stack = new Stack<Integer>();
			stack.push(list.get(i));
			_combination(ret, list, stack, i + 1, count);
		}
		return ret;
	}

	private static void _combination(List ret, List list, Stack stack, int index, int count) {
		for (int i = index; i < list.size(); i++) {
			stack.push(list.get(i));
			if (stack.size() == count) {
				ret.add(Arrays.asList(stack.toArray()));
				stack.pop();
				continue;
			}
			_combination(ret, list, stack, i + 1, count);
			stack.pop();
		}
	}

}

// 高速なScanner
class FastScannerMainD {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainD(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
