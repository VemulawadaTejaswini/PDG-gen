import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
	private	static	BufferedReader		br      = null;
	private	static	ArrayList<Integer>	list    = null;
	private	static	int[]				borders = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<Integer>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parseBorder();
		createPrimeList();

		for (int nLoop = 0; nLoop < borders.length; nLoop++) {
			getPrimeCnt(borders[nLoop]);
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

	private static void parseBorder() {
		int[]	aWork   = new int[30];
		int		nCnt    = 0;
		String	line    = null;

		while((line = parseNum()) != null) {
			aWork[nCnt] = Integer.parseInt(line);
			nCnt++;
		}

		if (nCnt > 0) {
			borders = new int[nCnt];
			for (int nLoop = 0; nLoop < nCnt; nLoop++) {
				borders[nLoop] = aWork[nLoop];
			}
		}
	}

	private static void createPrimeList() {
		boolean	bLoop  = true;
		boolean	bPrime = true;
		int		nPrime = 0;
		int[]	aWork  = borders.clone();

		Arrays.sort(aWork);
		list.add(2);
		for(int nNum = 3; bLoop; nNum += 2) {
			bPrime = true;

			for (int nLoop = 0; nLoop < list.size(); nLoop++) {
				nPrime = list.get(nLoop);
				if (nPrime <= (int)Math.sqrt((double)nNum)) {
					if (nNum % nPrime == 0) {
						bPrime = false;
						break;
					}
				}
				else {
					break;
				}
			}

			if (bPrime) {
				list.add(nNum);
				bLoop = nNum <= aWork[aWork.length - 1];
			}
		}
	}

	private static void getPrimeCnt(int nBorder) {
		int nCnt1 = 0;
		int nCnt2 = 0;

		if (list.get(0) < nBorder) {
			// 二分法＋逐次法でnBorder以下の素数の数を探す
			int nMin = 0;
			int nMax = list.size() - 1;
			int nCur = 0;

			while (nMax - nMin > 10) {
				nCur = (nMin + nMax) / 2;

				if (nBorder == list.get(nCur)) {
					break;
				}
				else if (nBorder > list.get(nCur)) {
					nMin = nCur + 1;
				}
				else if (nBorder < list.get(nCur)) {
					nMax = nCur - 1;
				}
			}

			nMin = Math.max(nMin - 1, 0);
			nMax = Math.min(nMax + 1, list.size() - 1);
			for (nCur = nMin; nCur <= nMax; nCur++) {
				if (nBorder == list.get(nCur)) {
					nCnt1 = nCur - 1;
					nCnt2 = nCur + 1;
					break;
				}
				else if (nBorder < list.get(nCur)) {
					nCnt1 = nCur - 1;
					nCnt2 = nCur;
					break;
				}
			}

			System.out.printf("%d %d\n", list.get(nCnt1), list.get(nCnt2));
		}
	}
}