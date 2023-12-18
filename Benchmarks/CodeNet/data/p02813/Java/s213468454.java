import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}

		int[] Q = new int[N];
		for (int i = 0; i < N; i++) {
			Q[i] = sc.nextInt();
		}

		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = i + 1;
		}

		int cp = 0;
		while (true) {
			boolean ok = true;
			for (int i = 0; i < a.length; i++) {
				if (P[i] != a[i]) {
					ok = false;
					break;
				}
			}
			if (ok) break;
			cp++;
			if (!nextPermutation(a)) break;
		}

		for (int i = 0; i < N; i++) {
			a[i] = i + 1;
		}

		int cq = 0;
		while (true) {
			boolean ok = true;
			for (int i = 0; i < a.length; i++) {
				if (Q[i] != a[i]) {
					ok = false;
					break;
				}
			}
			if (ok) break;
			cq++;
			if (!nextPermutation(a)) break;
		}

		System.out.println(Math.abs(cp - cq));
	}

	private static boolean nextPermutation(int[] a) {
		int n = a.length, k = n - 2, l = n - 1;
		while (k >= 0 && a[k] > a[k + 1]) k--;
		if (k < 0) return false;
		while (a[l] <= a[k]) l--;
		swap(a, k, l);
		k++;
		n--;
		while (k < n) swap(a, k++, n--);
		return true;
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}


}
