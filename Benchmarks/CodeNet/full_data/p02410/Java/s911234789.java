import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] inputRowAndCol = (input.readLine()).split("\\s");
		int row = Integer.parseInt(inputRowAndCol[0]);
		int col = Integer.parseInt(inputRowAndCol[1]);

		// 行列A
		int[][] matrixA = new int[row][col];
		String[] matrixData = null;
		for (int i = 0; i < row; i++) {
			matrixData = (input.readLine()).split("\\s");
			for (int j = 0; j < col; j++) {
				matrixA[i][j] = Integer.parseInt(matrixData[j]);
			}
		}
		// ベクトルb
		int[] vectorB = new int[col];
		for (int k = 0; k < col; k++) {
			vectorB[k] = Integer.parseInt(input.readLine());
		}

		// 行列の積
		for (int l = 0; l < row; l++) {
			int result = 0;
			for (int m = 0; m < col; m++) {
				result += (matrixA[l][m] * vectorB[m]);
			}
			System.out.println(result);
		}

	}

}

