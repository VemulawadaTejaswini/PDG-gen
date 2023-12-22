import java.util.Scanner;


public class Main {
	private	static	Scanner		m_stdin = null;
	private	static	double[]	m_point = null;

	static {
		m_stdin = new Scanner(System.in);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][]	aMatrix = null;
		int			nMax    = m_stdin.nextInt();

		for (int nLoop = 0; nLoop < nMax; nLoop++) {
			aMatrix = parseMatrix();
			calc(aMatrix);
		}
	}

	private static double[][] parseMatrix() {
		double[][]	aMatrix = null;

		double	dx1 = m_stdin.nextDouble();
		double	dy1 = m_stdin.nextDouble();
		double	dx2 = m_stdin.nextDouble();
		double	dy2 = m_stdin.nextDouble();
		double	dx3 = m_stdin.nextDouble();
		double	dy3 = m_stdin.nextDouble();

		aMatrix = new double[3][3];

		aMatrix[0][0] = (dx2 - dx1) * 2.0;
		aMatrix[0][1] = (dy2 - dy1) * 2.0;
		aMatrix[0][2] = (dx2 * dx2) - (dx1 * dx1) + (dy2 * dy2) - (dy1 * dy1);

		aMatrix[1][0] = (dx3 - dx2) * 2.0;
		aMatrix[1][1] = (dy3 - dy2) * 2.0;
		aMatrix[1][2] = (dx3 * dx3) - (dx2 * dx2) + (dy3 * dy3) - (dy2 * dy2);

		aMatrix[2][0] = (dx1 - dx3) * 2.0;
		aMatrix[2][1] = (dy1 - dy3) * 2.0;
		aMatrix[2][2] = (dx1 * dx1) - (dx3 * dx3) + (dy1 * dy1) - (dy3 * dy3);

		m_point = new double[2];
		m_point[0] = dx1;
		m_point[1] = dy1;

		return aMatrix;
	}

	private static void calc(double[][] aMatrix) {
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
						aMatrix[nRols][nLoop] -= dWork;
					}
				}
			}
		}

		{
			double da = 0.0;
			double db = 0.0;
			double dr = 0.0;

			for(int nRols = 0; nRols < aMatrix.length; nRols++) {
				if (aMatrix[nRols][0] == 1.0) {
					da = aMatrix[nRols][2];
				}
				if (aMatrix[nRols][1] == 1.0) {
					db = aMatrix[nRols][2];
				}
			}

			dr = Math.sqrt(((m_point[0] - da) * (m_point[0] - da)) + ((m_point[1] - db) * (m_point[1] - db)));

			System.out.printf("%.3f %.3f %.3f\n", da, db, dr);
		}
	}
}