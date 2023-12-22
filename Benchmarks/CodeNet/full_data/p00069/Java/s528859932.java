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
		Amida	amida = null;
		while((amida = parseAmida()) != null) {
			int[]	aSelRoute  = getSelRoute(amida);
			int[]	aGoalRoute = getGoalRoute(amida);

			showResult(aSelRoute, aGoalRoute, amida);
		}
	}

	private static int[] getSelRoute(Amida amida) {
		int		nDepth = amida.getDepth();
		int[]	aRoute = new int[nDepth + 1];

		// 選択された位置からの経路を求める
		aRoute[0] = amida.getSelect();
		for (int n = 1; n <= nDepth; n++) {
			aRoute[n] = amida.getNextPos(aRoute[n - 1], n);
		}

		return aRoute;
	}

	private static int[] getGoalRoute(Amida amida) {
		int		nDepth = amida.getDepth();
		int[]	aRoute = new int[nDepth + 1];

		// ゴールへ行くための経路を求める
		aRoute[nDepth] = amida.getGoal();
		for (int n = nDepth; n > 0; n--) {
			aRoute[n - 1] = amida.getNextPos(aRoute[n], n);
		}

		return aRoute;
	}

	private static void showResult(int[] aSel, int[] aGoal, Amida amida) {
		if (aSel[0] == aGoal[0]) {
			// スタート位置が一緒なら線は要らない
			System.out.println(0);
		}
		else {
			int		nLen  = aSel.length - 1;
			int		nLoop = 0;
			int		nSp   = 0;
			int		nGp   = 0;
			boolean	bPlus = false;

			for (nLoop = 1; nLoop < nLen; nLoop++) {
				nSp = aSel[nLoop];
				nGp = aGoal[nLoop];
				if (nSp == nGp - 1 || nSp == nGp + 1) {
					// 右か左に1マス移動するとゴールへたどり着ける
					if (amida.getNextPos(nSp, nLoop) == nSp && amida.getNextPos(nGp, nLoop) == nGp) {
						// 現在地と右または左の位置に横棒が引かれていない
						bPlus = true;
						break;
					}
				}
			}

			if (bPlus) {
				System.out.printf("%d %d\n", nLoop, (nSp < nGp) ? nGp - 1 : nSp - 1);
			}
			else {
				System.out.println(1);
			}
		}
	}

	private static Amida parseAmida() {
		Amida	amida    = null;
		int		nLines   = 0;
		int		nSelect  = 0;
		int		nGoal    = 0;
		int		nDepth   = 0;
		String	strCross = null;

		if ((nLines = parseNum()) > 0) {
			if ((nSelect = parseNum()) > 0) {
				if ((nGoal = parseNum()) > 0) {
					if ((nDepth = parseNum()) > 0) {
						amida = new Amida();
						amida.setLines(nLines);
						amida.setSelect(nSelect);
						amida.setGoal(nGoal);
						amida.setDepth(nDepth);

						for (int n = 0; n < nDepth; n++) {
							strCross = parseStdin();
							amida.setCross(n, strCross);
						}
					}
				}
			}
			
		}

		return amida;
	}

	private static int parseNum() {
		int		sum   = 0;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			sum = Integer.parseInt(strIn);
		}
		
		return sum;
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

class Amida {
	private	int		m_nLines;
	private	int		m_nSelect;
	private	int		m_nGoal;
	private	int		m_nDepth;
	private	int[]	m_aCross;

	public	Amida() {}

	public	void setLines(int nLines) {
		m_nLines = nLines;
	}

	public	int getLines() {
		return m_nLines;
	}

	public	void setSelect(int nSelect) {
		m_nSelect = nSelect;
	}

	public	int getSelect() {
		return m_nSelect;
	}

	public	void setGoal(int nGoal) {
		m_nGoal = nGoal;
	}

	public	int getGoal() {
		return m_nGoal;
	}

	public	void setDepth(int nDepth) {
		m_nDepth = nDepth;

		if (m_aCross == null) {
			m_aCross = new int[nDepth];
		}
	}

	public	int getDepth() {
		return m_nDepth;
	}

	public	void setCross(int nIndex, String strCross) {
		if (m_aCross != null) {
			int	nBit = 0;

			for (int n = strCross.length() - 1;n >= 0; n--) {
				nBit <<= 1;
				nBit  |= (strCross.charAt(n) == '1') ? 1 : 0;
			}

			m_aCross[nIndex] = nBit;
		}
	}

	public	int getNextPos(int nPos, int nDepth) {
		int	nNext = nPos;

		if (m_aCross != null) {
			int	nBit = m_aCross[nDepth - 1];
			int	nCur = nPos - 1;

			if (nCur != 0 && (nBit & (1 << nCur - 1)) != 0) {
				nNext = nPos - 1;
			}
			else if (nCur != m_nLines - 1 && (nBit & (1 << nCur)) != 0) {
				nNext = nPos + 1;
			}
		}

		return nNext;
	}
}