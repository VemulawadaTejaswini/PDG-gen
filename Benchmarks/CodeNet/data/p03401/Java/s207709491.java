import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int xArr[] = new int[N];
		/*
		 * xArr[0] = 0; xArr[N + 1] = 0;
		 */

		int newArr[][] = new int[N][N - 1];
		int sum = 0;

		for (int i = 0; i < N; i++) {
			xArr[i] = s.nextInt();
		}
		s.close();

		int k = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					newArr[i][k] = xArr[j];
					k++;
				}
			}
			k = 0;
		}

		int begin = 0;
		int middle = 0;
		int end = 0;
		for (int i = 0; i < N; i++) {
			begin = Math.abs(newArr[i][0]);
			end = Math.abs(newArr[i][N-2]);
			for (int j = 1; j < N - 1; j++) {
				middle += Math.abs(newArr[i][j] - newArr[i][j-1]);
			}
			System.out.println(begin + middle + end);
			middle=0;
		}
	}
}