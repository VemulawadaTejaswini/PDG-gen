import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int countLeft(int[] arr, int idx) {
		int res = 0;
		for(int i=idx-1;i>=0;i--) {
			if(arr[idx] == arr[i]) {
				res++;
			}else {
				break;
			}
		}
		return res;
	}

	int countRight(int[] arr, int idx) {
		int res = 0;
		for(int i=idx+1;i<arr.length;i++) {
			if(arr[idx] == arr[i]) {
				res++;
			}else {
				break;
			}
		}
		return res;
	}

	long solv(int[][] c) {
		long score = 0;
		
		for(long i=-1;;i++) {
//			System.err.println("(" + i + ")");
			long tempScore = 0;
			// 消滅
			for(int h=0;h<H;h++) {
				int[] nl = Arrays.copyOf(c[h], c[h].length);
				for(int w=0;w<W;w++) {
					if(countLeft(c[h],w) + countRight(c[h],w) + 1 >= K) {
						tempScore += c[h][w];
						nl[w] = 0;
					}
				}
				c[h] = nl;
			}
			
			if(i > 0 && tempScore == 0) {
				break;
			}
//			System.err.println(tempScore + " * " + "2^" + i);
			score += tempScore*Math.pow(2, i);
			
			// 落下
			for(int w=0;w<W;w++) {
				int b = H-1, t = H-1;
				while(true) {
					while(b >= 0 && c[b][w] != 0) b--;
					t=b-1;
					while(t >= 0 && c[t][w] == 0) t--;
					
					if(b<0 || t <0) {
						break;
					}
					
					c[b][w] = c[t][w];
					c[t][w] = 0;
				}
			}
			
//			System.err.println("--" + i);
//			for(int h=0;h<H;h++) {
//				System.err.println(Arrays.toString(c[h]));
//			}
			
		}
		return score;
	}
	int H,W,K;
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		H = sc.nextInt();
		W = sc.nextInt();
		K = sc.nextInt();


		int[][] c = new int[H][W];
		for(int i=0;i<H;i++) {
			String s = sc.next();
			for(int j=0;j<W;j++) {
				c[i][j] = s.charAt(j)-'0';
			}
		}
		
		sc.close();

		long ans = 0;

		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				int[][] d = copyOf(c);
				d[i][j] = 0;
				long a = solv(d);
//				System.err.println(i + "," + j + "\t" + a);
				ans = Math.max(ans, a);
			}
		}
		
		out.println(ans);
	}

	private int[][] copyOf(int[][] a){
		int[][] r = new int[a.length][];
		for(int i=0;i<a.length;i++) {
			r[i] = Arrays.copyOf(a[i], a[i].length);
		}
		return r;
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
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long max(long[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int min(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long min(long[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
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
