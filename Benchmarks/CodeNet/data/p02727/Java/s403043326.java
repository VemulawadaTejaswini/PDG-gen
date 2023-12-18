import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		Integer[] P = new Integer[A];
		Integer[] Q = new Integer[B];
		Integer[] R = new Integer[C];



		for (int i = 0; i < A; i++) {
			P[i] = scan.nextInt();
		}
		for (int i = 0; i < B; i++) {
			Q[i] = scan.nextInt();
		}
		for (int i = 0; i < C; i++) {
			R[i] = scan.nextInt();
		}

		Arrays.sort(P, Collections.reverseOrder());
		Arrays.sort(Q, Collections.reverseOrder());
		Arrays.sort(R, Collections.reverseOrder());

		Integer[] ALL = new Integer[X+Y];

				for (int i = 0; i < X; i++) {
					ALL[i] = P[i];
				}
				for (int i = X; i < X+Y; i++) {
					ALL[i] = Q[i-X];
				}

				int indexALL = 0;
				int indexC = 0;

				while (indexALL < X+Y && indexC < C ) {

					if (ALL[indexALL] < R[indexC]) {
						ALL[indexALL] = R[indexC];
						indexC++;
					}

					indexALL++;
				}
				Arrays.sort(ALL, Collections.reverseOrder());

				double result = 0;

				for (int element: ALL) {
					result += element;
				}

		System.out.println(result);
	}
}