import java.util.Scanner;

class Main {
	static void swap(int[] a, int b, int c) {
		int d = a[b];
		a[b] = a[c];
		a[c] = d;
	}

	static int[] sort(int[] a, int l, int r) {
		int pl = l;
		int pr = r;
		int x = a[(pl + pr) / 2];
		do {
			while (a[pl] < x)
				pl = pl + 1;
			while (a[pr] > x)
				pr = pr - 1;
			if (pl <= pr){
				swap(a, pl, pr);
				pl = pl + 1;
				pr = pr - 1;
			}
		} while (pl <= pr);
		if (l < pr)
			sort(a, l, pr);
		if (r > pl)
			sort(a, pl, r);
		return a;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();	
		}
		int t = 1;
		for (int i = 1; i < n + 1; i++) {
			if (i * (i - 1) / 2 < k  && k < ((i + 1) * i / 2) + 1) {
				t = i;
				break;
			}
		}
		int l = 0;
		if (t == 1) {
			for (int i= 0; i < n; i++)
				l = l + a[i];
			System.out.println(l);
		}
		else {
			int[] s = new int[t];
			int max = 0; 
			for (int i = 0; i < n - t + 1; i++) {
				max = max + a[i]; 
			}
			s[0] = max;
			for (int i = 1; i < t; i++) {
				int m = 0;
				for (int j = i; j < n - t + i + 1; j++) {
					m = m + a[j];
				}
				s[i] = m;
			}
			sort(s, 0, t - 1);
			int r = t - 1 - (k - (t - 1) * t / 2 - 1);
			System.out.println(s[r]);
		}
	}
}