
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] aa = new int[n];
		int[] bb = new int[n];
		for (int i = 0; i < n; i++) {
			aa[i] = in.nextInt();
			bb[i] = in.nextInt();
		}

		long a, b, pa, pb;
		a = aa[0];
		b = bb[0];
		pa = a;
		pb = b;
		// System.out.println(aa[0] + ":" + bb[0] + "\t" + a + "," + b);
		for (int i = 1; i < n; i++) {
			if (aa[i] >= aa[i - 1] && bb[i] > bb[i - 1]) {// increased
				a = (a / aa[i - 1]) * aa[i];
				b = (b / bb[i - 1]) * bb[i];
			} else {// 3:2 -> 2:3
				int nexta = aa[i];
				int nextb = bb[i];
				while (nexta < aa[i - 1] || nextb < bb[i - 1]) {// 2:3 -> 6:4
					nexta += aa[i];
					nextb += bb[i];
				}
				a = (a / aa[i - 1]) * nexta;
				b = (b / bb[i - 1]) * nextb;
			}
			// System.out.println(aa[i] + ":" + bb[i] + "\t" + a + "," + b);
			// if (pa > a || pb > b)
			// return;
			// pa = a;
			// pb = b;
		}
		if (a < 0 || b < 0) {
			while (true) {

			}
		}
		System.out.println((a + b));
	}
}
