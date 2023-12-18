import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long h = Long.parseLong(sc.next());
		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			b[i] = Long.parseLong(sc.next());
		}
		System.out.println(binarySearch(a, b, h, 0));
	}
	public static int binarySearch(long[] a, long[] b, long h, int c) {
		long maxa = 0;
		long maxb = 0;
		int indexa = 0;
		int indexb = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxa) {
				maxa = a[i];
				indexa = i;
			}
			if (b[i] > maxb) {
				maxb = b[i];
				indexb = i;
			}
		}
		if (Math.max(maxa, maxb) >= h)
			return c + 1;
		else {
			if (a.length == 1) {
				return binarySearch(a, b, h - maxa, c + 1);
			}
			else {
				long[] pa = new long[a.length - 1];
				long[] pb = new long[b.length - 1];
				for (int i = 0; i < indexb; i++) {
					pa[i] = a[i];
					pb[i] = b[i];
				}
				for (int i = indexb; i < pa.length; i++) {
					pa[i] = a[i + 1];
					pb[i] = b[i + 1];
				}
				return Math.min(binarySearch(a, b, h - maxa, c + 1), binarySearch(pa, pb, h - maxb, c + 1));
			}
		}
	}
}