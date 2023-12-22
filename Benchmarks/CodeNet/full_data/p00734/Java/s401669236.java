import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int[] sn = new int[N];
			int[] sm = new int[M];
			int sumn = 0;
			for (int i = 0; i < N; ++i) {
				sn[i] = sc.nextInt();
				sumn += sn[i];
			}
			int summ = 0;
			for (int i = 0; i < M; ++i) {
				sm[i] = sc.nextInt();
				summ += sm[i];
			}
			int ansn = -1;
			int ansm = -1;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < M; ++j) {
					if (sumn - sn[i] + sm[j] == summ - sm[j] + sn[i]) {
						if (ansn == -1 || ansn + ansm > sn[i] + sm[j]) {
							ansn = sn[i];
							ansm = sm[j];
						}
					}
				}
			}
			if (ansn == -1) {
				System.out.println(-1);
			} else {
				System.out.println(ansn + " " + ansm);
			}
		}
	}
}