import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Piece {
	int w,h;
	public Piece(int _h,int _w) {
		h = _h;
		w = _w;
	}
	
	public Piece[] cut(int s) {
		Piece[] res = new Piece[2];
		
		s %= (w+h);
		if(s < w) {
			//縦に切る
			res[0] = new Piece(h, s);
			res[1] = new Piece(h, w-s);
			
		}else {
			//横に切る
			s -= w;
			res[0] = new Piece(s, w);
			res[1] = new Piece(h-s, w);
		}
		
		Arrays.sort(res, (a,b)->(Integer.compare(a.h*a.w, b.h*b.w) ));
		
		return res;
	}
	
}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		while(true) {
			int n = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();
			
			if(n==0 && w==0 && d==0) {
				break;
			}

			List<Piece> l = new LinkedList<>();
			l.add(new Piece(d,w));
			
			for(int i=0;i<n;i++) {
				int p = sc.nextInt()-1;
				int s = sc.nextInt();
				
				Piece t = l.get(p);
				Piece[] c = t.cut(s);
				
				l.remove(p);
				l.add(c[0]);
				l.add(c[1]);
			}
			
			l.sort((a,b)->(Integer.compare(a.h*a.w, b.h*b.w) ));
			
			StringBuffer sb = new StringBuffer();
			for(Piece x : l) {
				sb.append(x.h*x.w);
				sb.append(" ");
			}
			out.println(sb.substring(0,sb.length()-1));
		}
		
		sc.close();

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

