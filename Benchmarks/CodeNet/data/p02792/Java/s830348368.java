import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private void a() {
		for(int i=1;i<=1000;i++) {
			for(int j=1;j<=1000;j++) {
				String a = String.valueOf(i);
				String b = String.valueOf(j);
				
				if(a.charAt(0) == b.charAt(b.length()-1) && b.charAt(0) == a.charAt(a.length()-1)) {
					System.err.println(a + " , " +  b);
				}
				
			}
		}
	}
	
	// aの先頭をxとしたときの、組み合わせの数
	private long fun(int N) {
		long result = 0;
		
		long[] numOfA = new long[10];
		long[] numOfB = new long[10];
		
		
		for(int i=1;i<=N;i++) {
			String s = String.valueOf(i);
			numOfA[s.charAt(0) -  '0']++;
			numOfB[s.charAt(s.length()-1) -  '0']++;
		}
		
		for(int i=1;i<=9;i++) {
			result += numOfA[i]*numOfB[i];
		}
		return result;
	}
	

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		
		sc.close();

		// d[h][t] : hではじまりtでおわる数字の数 (N以下で）
		long[][] d = new long[10][10];
		
		for(int i=1;i<=N;i++) {
			String s = String.valueOf(i);
			int h = s.charAt(0)-'0';
			int t = s.charAt(s.length()-1)-'0';
			
			d[h][t]++;
		}

		long result = 0;
		for(int a=1;a<=9;a++) {
			for(int b=1;b<=9;b++) {
				//aではじまりbで終わる数と、bではじまりaで終わる数
				result += d[a][b] * d[b][a];
			}
		}
		
		out.println(result);
		

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
