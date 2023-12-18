import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] l = new int[n];

		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}

		int minmp = Integer.MAX_VALUE;
		int count = 0;

		int[] order = new int[n + 1];
		order[0] = 1;

		for (int i = 0; i < n; i++) {
			order[i + 1] = order[i] * 4;
		}

		while (count < Math.pow(4, n)) {
			int a = 0;
			int b = 0;
			int c = 0;
			int mp = 0;
			for (int i = 0; i < n; i++) {
				int mod = (count % order[i + 1]) / order[i];

				switch (mod) {
				case 0: {
					if (a != 0) {
						mp += 10;
					}
					a += l[i];
					break;
				}
				case 1: {
					if (b != 0) {
						mp += 10;
					}
					b += l[i];
					break;
				}
				case 2: {
					if (c != 0) {
						mp += 10;
					}
					c += l[i];
					break;
				}
				case 3: {
					break;
				}
				}
			}
			//			System.out.println("count:" + count + ", a:" + a + ", b:" + b + ", c:" + c);
			count++;
			if (a == 0 || b == 0 || c == 0) {
				continue;
			} else {
				mp += Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c);
				//				System.out.println("mp:" + mp + ", A-a:" + Math.abs(A - a) + ", B-b:" + Math.abs(B - b) + ", C-c:"
				//						+ Math.abs(C - c));
				//				System.out.println();
				if (mp < minmp) {
					minmp = mp;
				}
			}
		}

		System.out.println(minmp);
		sc.close();
	}
}