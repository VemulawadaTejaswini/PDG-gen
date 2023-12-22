import java.util.Scanner;

public class Main {

	/*
	 * １行目に n と m が空白区切りで与えられます。
	 * 続く n 行に行列 A の要素 aij が空白区切りで与えられます。
	 * 続く m 行にベクトル b
	 * の要素 bi がそれぞれ１行に与えられます。
	 */

	/*
	 * ci=?j=1maijbj = ai1b1+ai2b2+...+aimbm
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		String[] lineArray = line.split("[\\s]+");

		int n = Integer.parseInt(lineArray[0]);
		int m = Integer.parseInt(lineArray[1]);

		int[][] array = new int[n][m];
		int[] vector = new int [m];
		long[] c = new long[n];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < vector.length; i++) {
			vector[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				c[i] += array[i][j] * vector[j]; 
			}
		}

		for (long l : c) {
			System.out.println(l);
		}

	}

}