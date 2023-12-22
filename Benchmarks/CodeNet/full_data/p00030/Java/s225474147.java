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
		String		line  = null;
		String[]	token = null;
		int[]		aTrm  = null;
		int			nSum  = 0;
		int			nTrm  = 0;
		int			nCab  = 0;

		while((line = parseNum()) != null) {
			token = line.split(" ");
			nTrm  = Integer.parseInt(token[0]);
			nSum  = Integer.parseInt(token[1]);
			if (nTrm == 0 && nSum == 0) {
				break;
			}
			aTrm  = new int[nTrm];
			nCab  = calc(0, 1, 0, nSum, aTrm);
			System.out.println(nCab);
		}
	}

	private static String parseNum() {
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

	private static int calc(int nSumC, int nTrmC, int nCst, int nSumM, int[] aTrm) {
		int	nCnt = 0;

		for (int n = nCst; n <= 9; n++) {
			aTrm[nTrmC - 1] = n;
			if ((nTrmC == aTrm.length) && (nSumC + n == nSumM)) {
				// 最終項までの総和が指定した総和と一致した
				nCnt += 1;
			}
			else if ((nTrmC != aTrm.length) && (nSumC + n < nSumM)) {
				// 最終項より前までの総和が指定した総和より小さい
				nCnt += calc(nSumC + n, nTrmC + 1, n + 1, nSumM, aTrm);
			}
			else if (nSumC + n >= nSumM) {
				break;
			}
		}

		return nCnt;
	}
}