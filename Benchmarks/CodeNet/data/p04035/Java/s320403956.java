import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		int N, L;
		N = scc.nextInt();
		L = scc.nextInt();
		int[] a = new int[N];
		long q = 0;
		int[] w = new int[N - 1];
		for (int i = 0; i < a.length; i++) {
			a[i] = scc.nextInt();
			q += a[i];
		}
		int forword = 0, last = N - 1;
		for (int i = 0; i < N - 1; i++) {
			if (q < L)
				break;
			if (a[forword] <= a[last]) {
				q = q - a[forword];
				forword++;
				w[i] = forword;
			} else {
				q = q - a[last];
				w[i] = last;
				last--;
			}
		}
		if (forword == last) {
			System.out.println("Possible");
			for (int i = 0; i < w.length; i++) {
				System.out.println(w[i]);
			}
		} else {
			System.out.println("Impossible");
		}
	}
}
