import java.util.Scanner;

public class Main {

	static long[] a;
	static long[] b;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			long k = sc.nextInt();

			a = new long[n + 1];
			b = new long[m + 1];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}
			a[n] = 1000000000 + 1l;

			for (int i = 0; i < m; i++) {
				b[i] = sc.nextLong();
			}
			b[m] = 1000000000 + 1l;

			int l = 0;
			int r = 0;

			long time = 0l;
			int count = 0;

			while (time + a[l] <= k || time + b[r] <= k) {

				if (chooseLeft(l, r)) {
					time += a[l];
					l++;
					count++;
				} else {
					time += b[r];
					r++;
					count++;
				}

			}

			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean chooseLeft(int l, int r) {
		if(l == a.length-1) return false;
		if(r == b.length-1) return true;
		if (a[l] == b[r]) {
			return chooseLeft(l + 1, r + 1);
		} else if (a[l] < b[r]) {
			return true;
		} else {
			return false;
		}
	}

}