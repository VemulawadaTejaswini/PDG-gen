import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;
	private	static	int				IX = 0;
	private	static	int				IY = 1;
	private	static	int				IZ = 2;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(parsePos());
	}

	private static void solve(int[][] pos) {
		boolean	bHit = true;

		if (!isEmpty(pos[2], pos[3], pos[4])) {
			bHit = !isCross(pos[0], pos[1], pos[2], pos[3], pos[4]);
		}

		System.out.println(bHit?"HIT":"MISS");
	}

    private static boolean isCross(int[] m, int[] e, int[] a, int[] b, int[] c) {
		double[][]	mtr = new double[3][4];

		for (int i = IX; i <= IZ; i++) {
			mtr[i][0] = b[i]-a[i];	// s
			mtr[i][1] = c[i]-a[i];	// t
			mtr[i][2] = e[i]-m[i];	// u
			mtr[i][3] = e[i]-a[i];	// k
		}

		calc(mtr);

		return (0.0 <= mtr[0][3] && 0.0 <= mtr[1][3] && 0.0 <= mtr[0][3]+mtr[1][3] && mtr[0][3]+mtr[1][3] <= 1.0 && 0.0 <= mtr[2][3] && mtr[2][3] < 1.0);
	}

	private static void calc(double[][] aMatrix) {
		int nActRow = -1;
 
		for(int nCols = 0; nCols < aMatrix[0].length - 1; nCols++) {
			nActRow = -1;

			// 全ての行のnCols番目の列の要素が1になるように行の要素を除算する
			for(int nRols = nCols; nRols < aMatrix.length; nRols++) {
				if (aMatrix[nRols][nCols] != 0.0) {
					if (nActRow == -1) {
						nActRow = nRols;
					}

					for(int nLoop = aMatrix[0].length - 1; nLoop >= nCols; nLoop--) {
						aMatrix[nRols][nLoop] /= aMatrix[nRols][nCols];
					}
				}
			}

			// nActRowを上にもってくる
			if (nActRow != -1 && nActRow != nCols) {
				double[]	tmp  = aMatrix[nCols];
				aMatrix[nCols]   = aMatrix[nActRow];
				aMatrix[nActRow] = tmp;
				nActRow          = nCols;
			}

			// 全ての列の要素から最初に要素を1にした列の要素を減算する
			for(int nRols = 0; nRols < aMatrix.length; nRols++) {
				if (aMatrix[nRols][nCols] != 0.0 && nRols != nActRow) {
					for(int nLoop = aMatrix[0].length - 1; nLoop >= nCols; nLoop--) {
						double  dWork = aMatrix[nRols][nCols] * aMatrix[nActRow][nLoop];
						aMatrix[nRols][nLoop] -= dWork;
					}
				}
			}
		}
	}

	private static boolean isVertical(int[] m, int[] e, int[] a, int[] b, int[] c) {
		int[]	ab = {b[IX]-a[IX], b[IY]-a[IY], b[IZ]-a[IZ]};
		int[]	ac = {c[IX]-a[IX], c[IY]-a[IY], c[IZ]-a[IZ]};
		int[]	em = {m[IX]-e[IX], m[IY]-e[IY], m[IZ]-e[IZ]};
		int[]	n  = {ab[IY]*ac[IZ]-ac[IY]*ab[IZ], ab[IZ]*ac[IX]-ac[IZ]*ab[IX], ab[IX]*ac[IY]-ac[IX]*ab[IY]};

		return (em[IX]*n[IX]+em[IY]*n[IY]+em[IZ]*n[IZ]) == 0;
	}

	private static boolean isEmpty(int[] a, int[] b, int[] c) {
		int[]	ab = {b[IX]-a[IX], b[IY]-a[IY], b[IZ]-a[IZ]};
		int[]	ac = {c[IX]-a[IX], c[IY]-a[IY], c[IZ]-a[IZ]};
		int		w1 = ab[IX]*ab[IX]+ab[IY]*ab[IY]+ab[IZ]*ab[IZ];
		int		w2 = ac[IX]*ac[IX]+ac[IY]*ac[IY]+ac[IZ]*ac[IZ];
		int		w3 = ab[IX]*ac[IX]+ab[IY]*ac[IY]+ab[IZ]*ac[IZ];

		return (w1*w2-w3*w3) == 0;
	}

	private static int[][] parsePos() {
		int[][]	pos = new int[5][3];

		for (int i = 0; i < pos.length; i++) {
			String		str = parseStdin();
			String[]	lns = str.split(" ");
			pos[i][IX] = Integer.parseInt(lns[IX]);
			pos[i][IY] = Integer.parseInt(lns[IY]);
			pos[i][IZ] = Integer.parseInt(lns[IZ]);
		}
 
		return pos;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) {
            		stdin = tmp;
            	}
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}