import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int[] L = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			L[i] = Integer.parseInt(sc.next());
		}

		sc.close();

		Arrays.sort(L);
//		for (int i = 1; i <= N; i++) {
//			System.out.println(L[i]);
//		}

		int count = 0;
		for (int i = 1; i <= N - 2; i++) {
			for (int j = i + 1; j <= N - 1; j++) {
				int min = Math.max(L[i] - L[j], L[j] - L[i]);
				int max = L[i] + L[j];

				min++;
				int Le1 = j + 1;
				int Ri1 = N + 1;
				while (Le1 < Ri1) {
					int M = (Le1 + Ri1) / 2;
					if (L[M] >= min) {
						Ri1 = M;
					} else {
						Le1 = M + 1;
					}
				}

				int Le2 = j + 1;
				int Ri2 = N + 1;
				while(Le2 < Ri2) {
					int M = (Le2 + Ri2) / 2;
					if(L[M] >= max) {
						Ri2 = M;
					}else {
						Le2 = M + 1;
					}
				}

				count += Le2 - Le1;
			}
		}

		System.out.println(count);

	}
}
