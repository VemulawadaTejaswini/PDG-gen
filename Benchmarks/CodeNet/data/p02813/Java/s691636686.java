import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int[] s = new int[M];
 * ArrayDeque<Integer> deq = new ArrayDeque<>();
 *
 */
public class Main implements Runnable { //クラス名はCountOrder

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerCountOrder sc = new FastScannerCountOrder(System.in);

		try {
			int N = sc.nextInt();
			int A = 0;
			int B = 0;
			Integer[] n = new Integer[N];
			ArrayList<Integer> per = new ArrayList<Integer>();

			for (int i = 0; i < N; i++) {
				n[i] = i + 1;
				A += sc.nextInt() * Math.pow(10, N - (i + 1));
			}

			for (int i = 0; i < N; i++) {
				B += sc.nextInt() * Math.pow(10, N - (i + 1));
			}

			int each = 0;
			Permutation<Integer> p = new Permutation<>(n);
			do {
				//System.out.println(Arrays.toString(p.getObjes()));
				Integer[] eper = p.getObjes();
				for (int i = 0; i < eper.length; i++) {
					each += eper[i] * Math.pow(10, eper.length - (i + 1));

				}
				per.add(each);
				each = 0;
			} while (p.next());

			Collections.sort(per);

			/*
			System.out.println(A);
			System.out.println(B);
			
			for (Integer s : per) {
				System.out.println(s);
			}
			*/

			int a = Collections.binarySearch(per, A);
			int b = Collections.binarySearch(per, B);

			System.out.println(Math.abs(a - b));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

/**
*
* How to call
* Permutation<String> p = new Permutation<>(new String[] { "a", "b", "c" });
* do {
* 	System.out.println(Arrays.toString(p.getObjes()));
* } while (p.next());
*
*
*
* @author daichi.miyajima
*
* @param <T>
*/
class Permutation<T extends Serializable> {

	private int baseIndex;
	private int index;
	private T[] objs;

	private Permutation<T> subPermutation;

	public Permutation(T[] objs) {
		this(0, 0, objs.clone());
	}

	private Permutation(int baseIndex, int index, T[] objs) {
		if (objs == null || objs.length == 0) {
			throw new IllegalArgumentException();
		}

		this.baseIndex = baseIndex;
		this.index = index;
		this.objs = objs;

		if (this.index < this.objs.length - 1) {
			this.subPermutation = new Permutation<T>(this.baseIndex + 1, this.index + 1, this.objs);
		}
	}

	public T[] getTarget() {
		return this.objs;
	}

	public boolean next() {
		if (this.subPermutation == null) {
			return false;
		}

		boolean result = this.subPermutation.next();
		if (result == true) {
			return true;
		}

		this.swap(this.baseIndex, this.index);

		++this.index;
		if (this.objs.length <= this.index) {
			this.index = this.baseIndex;
			return false;
		}

		this.swap(this.index, this.baseIndex);
		return true;
	}

	public T[] getObjes() {
		return this.objs;
	}

	private void swap(int index1, int index2) {
		T tmp = this.objs[index1];
		this.objs[index1] = this.objs[index2];
		this.objs[index2] = tmp;
	}
}

//高速なScanner
class FastScannerCountOrder {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerCountOrder(InputStream in) {
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
