import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int X = 0;
		int Y = 0;
		int A = 0;
		int B = 0;
		int C = 0;
		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		int i, r = 0, g = 0;
		Integer R[] = new Integer[A];
		Integer G[] = new Integer[B];
		Integer N[] = new Integer[C];
		for (i = 0; i < A; i++) {
			R[i] = sc.nextInt();
		}
		Arrays.sort(R, Collections.reverseOrder());
		for (i = 0; i < B; i++) {
			G[i] = sc.nextInt();
		}
		Arrays.sort(G, Collections.reverseOrder());
		for (i = 0; i < C; i++) {
			N[i] = sc.nextInt();
		}
		Arrays.sort(N, Collections.reverseOrder());
		Integer NR[] = new Integer[X];
		Integer NG[] = new Integer[Y];
		for (i = 0; i < X; i++) {
			NR[i] = R[i];
			// System.out.println(NR[i]);
		}
		Arrays.sort(NR);
		for (i = 0; i < Y; i++) {
			NG[i] = G[i];
			// System.out.println(NG[i]);
		}
		Arrays.sort(NG);
		int flagr = 0, flagg = 0;
		for (i = 0; i < C; i++) {
			if (flagr == 1 && flagg == 0) {
				if (NG[g] < N[i]) {
					NG[g] = N[i];
					g++;
					if (g == Y)
						flagg = 1;
				}
			}
			if (flagg == 1 && flagr == 0) {
				if (NR[r] < N[i]) {
					NR[r] = N[i];
					r++;
					if (r == X)
						flagr = 1;
				}
			}
			if (flagr == 0 && flagg == 0 && NR[r] < NG[g]) {
				if (NR[r] < N[i]) {
					NR[r] = N[i];
					r++;
					if (r == X)
						flagr = 1;
				}
			}
			if (flagg == 0 && flagr == 0 && NR[r] >= NG[g]) {
				if (NG[g] < N[i]) {
					NG[g] = N[i];
					g++;
					if (g == Y)
						flagg = 1;
				}
			}
		}
		int sum = 0;
		for (i = 0; i < X; i++) {
			sum += NR[i];
		}
		for (i = 0; i < Y; i++) {
			sum += NG[i];
		}
		System.out.println(sum);
		sc.close();

	}

}