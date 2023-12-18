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

		for(int i = A-1; i >= A-X; i--) {
			ans += p[i];
		}
		for(int i = B-1; i >= B-Y; i--) {
			ans += q[i];
		}
		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);

		int i = A-X;
		int j = B-Y;
		int k = C-1;
		while (true) {
			if (i == A) {
				while (q[j] < r[k]) {
					ans += r[k] - q[j];
					j++;
					k--;
				}
				break;
			} else if (j == B) {
				while (p[i] < r[k]) {
					ans += r[k] - p[i];
					i++;
					k--;
				}
				break;
			}else if (p[i] < q[j]) {
				if (p[i] < r[k]) {
					ans += r[k] - p[i];
					i++;
				} else {
					break;
				}
			} else {
				if (q[j] < r[k]) {
					ans += r[k] - q[j];
					j++;
				} else {
					break;
				}
			}

			k--;
			if (k < 0) break;

		}

		System.out.println(ans);

	}

}