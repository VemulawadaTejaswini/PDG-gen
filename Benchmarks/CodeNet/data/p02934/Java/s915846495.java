import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner in = new MyScanner();
		int n = in.nextInt();
		double[] a = in.nextDoubleArray(n);
		double sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += 1/a[i];
		}
		
		System.out.println(1/sum);
		
	}
	
	private static class MyScanner {
		static Scanner sc = new Scanner(System.in);
		
		String next() {
			return sc.next();
		}
		
		String nextLine() {
			return sc.nextLine();
		}
		
		int nextInt() {
			return Integer.parseInt(sc.next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextInt();
			}
			return array;
		}
		
		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextDouble();
			}
			return array;
		}
		
		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}
			return array;
		}
		
	}
}
