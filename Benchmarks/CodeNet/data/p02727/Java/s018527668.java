import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int Y = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int ans = 0;
		int[] p = new int[A];
		int[] q = new int[B];
		int[] r = new int[C];
		for (int i = 0; i < A; i++ ) {
			p[i] = scan.nextInt();
		}
		for (int i = 0; i < B; i++ ) {
			q[i] = scan.nextInt();
		}
		for (int i = 0; i < C; i++ ) {
			r[i] = scan.nextInt();
		}

		for(int i = A-X; i < A; i++) {
			ans += p[i];
		}
		for(int i = B-Y; i < B; i++) {
			ans += q[i];
		}
		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);

		int i = A-X;
		int j = B-Y;
		int k = C-1;
		int t = 0;

		while (i != A && j != B) {
			t = 0;
			if (p[i] < q[j]) {
				t = p[i];
				i++;
			} else {
				t = q[j];
				j++;
			}

			if (t < r[k]) {
				ans += r[k] - t;
				k--;
			} else {
				break;
			}

			if (k < 0) break;
		}

		if (i == A) {
			while (q[j] < r[k] && k >= 0 && j < B) {
				ans += r[k] - q[j];
				j++;
				k--;
			}
		} else if (j == B) {
			while (p[i] < r[k] && k >= 0 && i < A) {
				ans += r[k] - p[i];
				i++;
				k--;
			}
		}

		System.out.println(ans);

	}

}