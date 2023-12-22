import java.util.Scanner;;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r, c;

		r = sc.nextInt();
		c = sc.nextInt();

		int[][] matrix = new int[r + 1][c + 1];

		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		sc.close();

		for(int i = 0; i <= r; i++) {
			matrix[i][c] = 0;
			for(int j = 0; j <= c; j++) {
				if(j < c) {
					System.out.printf("%d ", matrix[i][j]);
					matrix[i][c] = matrix[i][c] + matrix[i][j];
					matrix[r][j] = matrix[r][j] + matrix[i][j];
				} else if(j == c) {
					System.out.printf("%d\n", matrix[i][c]);
				}
			}
		}

	}
}

