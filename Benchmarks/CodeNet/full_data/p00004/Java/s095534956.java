import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][]	aMatrix = null;

		while((aMatrix = parseMatrix()) != null) {
			calcMatrix(aMatrix);
		}
	}

	private static double[][] parseMatrix() {
		double[][]	aMatrix = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					aMatrix = new double[2][3];
	
					String[]	as   = line.split(" ");
					double		d11 = Double.parseDouble(as[0]);
					double		d12 = Double.parseDouble(as[1]);
					double		d13 = Double.parseDouble(as[2]);
					double		d21 = Double.parseDouble(as[3]);
					double		d22 = Double.parseDouble(as[4]);
					double		d23 = Double.parseDouble(as[5]);
	
					aMatrix[0][0] = d11;
					aMatrix[0][1] = d12;
					aMatrix[0][2] = d13;
					aMatrix[1][0] = d21;
					aMatrix[1][1] = d22;
					aMatrix[1][2] = d23;
				}
			}
		}
		catch (NumberFormatException e) {}
		catch (IOException e) {}

		return aMatrix;
	}

	private static void calcMatrix(double[][] aMatrix) {
		int nFinRow = 0;
		int nActRow = -1;

		for(int nCols = 0; nCols < aMatrix[0].length - 1; nCols++) {
			nActRow = -1;

			// 全ての行のnCols番目の列の要素が1になるように行の要素を除算する
			for(int nRols = 0; nRols < aMatrix.length; nRols++) {
				if ((nFinRow & 1 << nRols) != 0) {
					continue;
				}

				if (aMatrix[nRols][nCols] != 0.0) {
					if (nActRow == -1) {
						nActRow = nRols;
						nFinRow = nFinRow | 1 << nRols;
					}

					for(int nLoop = aMatrix[0].length - 1; nLoop >= nCols; nLoop--) {
						aMatrix[nRols][nLoop] /= aMatrix[nRols][nCols];
					}
				}
			}

			// 全ての列の要素から最初に要素を1にした列の要素を減算する
			for(int nRols = 0; nRols < aMatrix.length; nRols++) {
				if (aMatrix[nRols][nCols] != 0.0 && nRols != nActRow) {
					for(int nLoop = aMatrix[0].length - 1; nLoop >= nCols; nLoop--) {
						double	dWork = aMatrix[nRols][nCols] * aMatrix[nActRow][nLoop];
						aMatrix[nRols][nLoop] -= dWork;//aMatrix[nActRow][nLoop];
					}
				}
			}
		}

		System.out.printf("%.3f %.3f\n", aMatrix[0][2], aMatrix[1][2]);
	}
}