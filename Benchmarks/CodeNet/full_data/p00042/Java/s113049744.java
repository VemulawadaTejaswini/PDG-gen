import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nCase = 1;
		while (parseTreasure(nCase++) != 0);
	}

	public static void knapsack(int[][] table, int[] item, int i) {
		int	nLen = table[0].length - 1;

		for (int c = nLen; c >= 0; c--) {
			if (c > nLen - item[1]) {
				table[i][c] = table[i-1][c];
			} else {
				table[i][c] = Math.max(table[i - 1][c], table[i - 1][c + item[1]] + item[0]);
			}
		}
	}

	private static int parseTreasure(int nCase) {
		String	strIn = null;
		int		nLen  = 0;
		int		nCap  = 0;

		if ((strIn = parseStdin()) != null) {
			if ((nCap = Integer.parseInt(strIn)) != 0) {
				strIn  = parseStdin();
				nLen   = Integer.parseInt(strIn);
				
				if (nLen > 0) {
					int[][]	table = new int[nLen + 1][nCap + 1];

					for (int n = 1; n <= nLen; n++) {
						int[]		item = new int[2];
						String[]	line = null;

						strIn = parseStdin();
						line  = strIn.split(",");
						item[0] = Integer.parseInt(line[0]);
						item[1] = Integer.parseInt(line[1]);

						knapsack(table, item, n);
					}

					for (int n = 1; n <= nCap; n++) {
						if (table[nLen][n] != table[nLen][0]) {
							System.out.printf("Case %d:\n", nCase);
							System.out.println(table[nLen][n - 1]);
							System.out.println(nCap - n + 1);
							break;
						}
					}
				}
			}
		}
		
		return nCap;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}