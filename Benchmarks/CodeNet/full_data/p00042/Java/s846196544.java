import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
	private	static	BufferedReader		br    = null;
	private	static	ArrayList<int[]>	table = null;
	private	static	int[]				aMax  = null;

	static {
		br    = new BufferedReader(new InputStreamReader(System.in));
		table = new ArrayList<int[]>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	cap = 0;
		while ((cap = parseTreasure()) != 0) {
			Collections.sort(table, new TheComparator());
			aMax = new int[2];
			calc(0, 0, cap);
			System.out.println(aMax[1]);
			System.out.println(aMax[0]);
		}
	}

	private static void calc(int nSumW, int nSumT, int nCap) {
		int	nLen = table.size();

		if (nLen > 0) {
			for(int i = 0; i < nLen; i++) {
				int	aItem[] = table.get(i);
				if (nSumW + aItem[0] <= nCap) {
					if (aMax[1] < nSumT + aItem[1]) {
						aMax[0] = nSumW + aItem[0];
						aMax[1] = nSumT + aItem[1];
					}
					table.remove(i);
					calc(nSumW + aItem[0], nSumT + aItem[1], nCap);
					table.add(i, aItem);
				}
			}
		}
	}

	private static int parseTreasure() {
		String	strIn = null;
		int		nLen  = 0;
		int		nCap  = 0;

		table.clear();
		if ((strIn = parseStdin()) != null) {
			if ((nCap = Integer.parseInt(strIn)) != 0) {
				strIn  = parseStdin();
				nLen   = Integer.parseInt(strIn);
				
				if (nLen > 0) {
					for (int n = 0; n < nLen; n++) {
						int[]		item = new int[2];
						String[]	line  = null;

						strIn = parseStdin();
						line  = strIn.split(",");
						item[0] = Integer.parseInt(line[1]);
						item[1] = Integer.parseInt(line[0]);
						table.add(item);
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

class TheComparator implements Comparator<int[]> {

    /** ソート対象のカラムの位置 */
    public int compare( int[] freq1, int[] freq2 ) {
        return (freq1[0] != freq2[0]) ? freq1[0] - freq2[0] : freq1[1] - freq2[1];
    }
}