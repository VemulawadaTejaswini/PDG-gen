import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private boolean runrun(String s) {
		for(int i=0;i<s.length()-1;i++) {
			if(Math.abs(s.charAt(i) - s.charAt(i+1)) > 1) {
				return false;
			}
		}
		return true;
	}
	
	private void guchoku() {
		int c = 0;
		for(long i=1;i<=1000000000L;i++) {
			String s = ""+i;
			if(runrun(s)) {
				c++;
				
			}
		}
		System.err.println(c);
	}
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

//		guchoku();
		
		int K = sc.nextInt();

		sc.close();

		HashMap<Integer, List<Integer>> h = new HashMap<>();
		h.put(-1, Arrays.asList(-1, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		h.put(0, Arrays.asList(0, 1));
		h.put(1, Arrays.asList(0, 1, 2));
		h.put(2, Arrays.asList(1, 2, 3));
		h.put(3, Arrays.asList(2, 3, 4));
		h.put(4, Arrays.asList(3, 4, 5));
		h.put(5, Arrays.asList(4, 5, 6));
		h.put(6, Arrays.asList(5, 6, 7));
		h.put(7, Arrays.asList(6, 7, 8));
		h.put(8, Arrays.asList(7, 8, 9));
		h.put(9, Arrays.asList(8, 9));

		int r = 0;
		int[] ans = null;

		SOLV: for (int a = -1; a <= 9; a++) {
			if(a==0)continue;
			for (int b : h.get(a)) {
				for (int c : h.get(b)) {
					for (int d : h.get(c)) {
						for (int e : h.get(d)) {
							for (int f : h.get(e)) {
								for (int g : h.get(f)) {
									for (int i : h.get(g)) {
										for (int j : h.get(i)) {
											for (int k : h.get(j)) {
												if (k == -1) {
													continue;
												}

												r++;
												if (r == K) {
													ans = new int[] { a, b, c, d, e, f, g, i, j, k };
													break SOLV;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		String s = "";
		for (int x : ans) {
			if (x != -1) {
				s += x;
			}
		}

		out.println(s);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, long[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}

	@SuppressWarnings("unused")
	private int max(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for (int i = 1; i < arr.length; i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long max(long[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for (int i = 1; i < arr.length; i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int min(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for (int i = 1; i < arr.length; i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long min(long[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for (int i = 1; i < arr.length; i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private long[] nextLongArray(Scanner sc, int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextLong();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
