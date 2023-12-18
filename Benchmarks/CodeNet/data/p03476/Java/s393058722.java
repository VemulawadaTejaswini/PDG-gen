import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int q = s.nextInt();

		int[] l = new int[q];
		int[] r = new int[q];
		int c = 0;
		int flg = 0;
		int p = 0;
		int begin = 0;
		int end = 0;

		for (int i = 0; i < q; i++) {
			l[i] = s.nextInt();
			r[i] = s.nextInt();
		}

		for (int j = 0; j < q; j++) {
			begin = l[j];
			end = r[j];
			for (int k = begin; k <= end; k++) {
				if (k == 1 || k == 2) {
					flg++;
				}
				for (int m = 2; m < k; m++) {
					if (k % m == 0) {
						flg++;
						break;
					}
				}

				if (flg == 0) {
					for (int n = 2; n < (k + 1) / 2; n++) {
						if ((k + 1) / 2 % n == 0) {
							flg++;
							break;
						}
					}
				}

				if (flg == 0) {
					c++;
				}
				flg = 0;
			}
			System.out.println(c);
			c = 0;

		}

	}
}
