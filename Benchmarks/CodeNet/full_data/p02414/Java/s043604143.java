import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int[][] table = new int[num1][num2];
		int[][] grid = new int[num2][num3];

		for (int i1 = 0; i1 < num1; i1++) {
			for (int i2 = 0; i2 < num2; i2++) {
				table[i1][i2] = sc.nextInt();
			}
		}

		for (int i1 = 0; i1 < num2; i1++) {
			for (int i2 = 0; i2 < num3; i2++) {
				grid[i1][i2] = sc.nextInt();
			}
		}

		long [][] sum = new long[num1][num3];
		for (int i3 = 0; i3 < num1; i3++) {
			for (int i1 = 0; i1 < num3; i1++) {
				for (int i2 = 0; i2 < num2; i2++) {
					sum[i3][i1] += table[i3][i2] * grid[i2][i1];
				}

				if (i1 >= num3-1) {
					System.out.println(sum[i3][i1]);
				} else {
					System.out.print(sum[i3][i1] + " ");
				}
			}
		}
	}
}
