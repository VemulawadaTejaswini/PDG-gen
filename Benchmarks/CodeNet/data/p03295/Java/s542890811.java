import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int bmin = Integer.MAX_VALUE;
		int ans = 0;
		long[] data_set = new long[m];
		for (int i = 0; i < m; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			data_set[i] = a * 1000000 + b;
		}
		
		data_set = sort(data_set);
		
		
		for (int i = 0; i < m; i++) {
			long buf = data_set[i];
			long a = buf / 1000000;
			long b = buf % 1000000;

			if (bmin <= a) {
				ans++;
				bmin = Integer.MAX_VALUE;
			}
			bmin = Math.min(bmin, (int) b);
		}
		System.out.println(ans + 1);
		scn.close();
	}

	public static long[] sort(long[] data_set) {
		long[] b = new long[data_set.length];
		int middle = (b.length - 1) / 2;
		long[] a1 = new long[middle + 1];
		long[] a2;

		if (b.length > 0) {
			a2 = new long[b.length - middle-1];
		} else {
			a2 = new long[0];
		}

		if (b.length < 2) {
			return data_set;
		}

		System.arraycopy(data_set, 0, a1, 0, middle + 1);
		System.arraycopy(data_set, middle + 1, a2, 0, b.length - middle - 1);
		a1 = sort(a1);
		a2 = sort(a2);

		int bi = 0;
		int a1i = 0;
		int a2i = 0;

		for (int i = 0; i < b.length - 1; i++) {
			if (a1i < a1.length && a2i < a2.length) {
				if (a1[a1i] < a2[a2i]) {
					b[bi] = a1[a1i];
					a1i++;
				} else {
					b[bi] = a2[a2i];
					a2i++;
				}
				bi++;
			}
		}
		if (a1i > a2i) {
			for (int j = a2i; j < a2.length; j++, bi++) {
				b[bi] = a2[j];
			}
		} else {
			for (int j = a1i; j < a1.length; j++, bi++) {
				b[bi] = a1[j];
			}
		}
		return b;
	}
}
