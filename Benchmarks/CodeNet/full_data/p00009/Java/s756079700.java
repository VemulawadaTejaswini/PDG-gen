import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	static	BufferedReader		br   = null;
	private	static	ArrayList<Integer>	list = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<Integer>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createPrimeList();

		String line;
		while((line = parseNum()) != null) {
			int nCnt = getPrimeCnt(Integer.parseInt(line));
			System.out.println(nCnt);
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

	private static void createPrimeList() {
		boolean	bPrime = true;
		int		nPrime = 0;
		list.add(2);
		for(int nNum = 3; nNum < 1000000; nNum += 2) {
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
			}
		}
	}

	private static int getPrimeCnt(int nBorder) {
		int nCnt = 0;

		if (list.get(0) == nBorder) {
			nCnt = 1;
		}
		else if (list.get(0) < nBorder) {
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
					break;
				}
				else if (nBorder < list.get(nCur)) {
					nCur--;
					break;
				}
			}

			nCnt = nCur + 1;
		}

		return nCnt;
	}
}