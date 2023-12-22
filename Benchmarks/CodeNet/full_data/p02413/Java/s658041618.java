import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] table = new int[r+1][c+1];

		for (int row = 0; row < r; row++) {
			for (int col = 0; col < c; col++) {
				int now = sc.nextInt();

				table[row][col] = now;

				table[row][c] += now;
				table[r][col] += now;
				table[r][c] += now;
			}
		}
		sc.close();

		for(int[] col : table) {
			StringJoiner sj = new StringJoiner(" ");
			for(int val : col) {
				sj.add(String.valueOf(val));
			}
			System.out.println(sj);
		}
	}
}