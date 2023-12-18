
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		new Main().solveA2();
	}

	char[] sArray;
	char[] tArray;

	List<String> wkList = new ArrayList<String>();
	Map<String, String> wkMap = new TreeMap<String, String>();

	private String isMatch(int currentSI, int nextSartT) {

		String key = currentSI + ":" + nextSartT;
		if (wkMap.containsKey(key)) {
			return wkMap.get(key);
		}
		StringBuilder builder = new StringBuilder();
		if (sArray[currentSI] == tArray[nextSartT]) {
			builder.append(sArray[currentSI]);
			if (currentSI + 1 < sArray.length && nextSartT + 1 < tArray.length) {
				builder.append(isMatch(currentSI + 1, nextSartT + 1));
			}
		} else {
			String wkS = "";
			if (nextSartT + 1 < tArray.length) {
				wkS = isMatch(currentSI, nextSartT + 1);
			}
			String wkS2 = "";
			if (currentSI + 1 < sArray.length) {
				wkS2 = isMatch(currentSI + 1, nextSartT);
			}
			if (wkS.length() > wkS2.length()) {
				builder.append(wkS);
			} else {
				builder.append(wkS2);
			}
		}
		wkMap.put(key, builder.toString());
		return builder.toString();
	}

	private void solveA() {
		Scanner scanner = null;
		String stringS = "";
		String stringT = "";

		try {
			scanner = new Scanner(System.in);
			stringS = scanner.next();
			stringT = scanner.next();

			sArray = stringS.toCharArray();
			tArray = stringT.toCharArray();

			int start = 0;
			for (int i = 0; i < sArray.length; i++) {
				String wk = isMatch(i, start);
				wkList.add(wk);
			}

			String result = "";
			int resultLength = 0;
			for (int i = 0; i < wkList.size(); i++) {
				if (resultLength < wkList.get(i).length()) {
					resultLength = wkList.get(i).length();
					result = wkList.get(i);
				}
			}

			System.out.println(result);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveA2() {
		Scanner scanner = null;
		String stringS = "";
		String stringT = "";

		try {
			scanner = new Scanner(System.in);
			stringS = scanner.next();
			stringT = scanner.next();

			String[][] lengthArray = new String[stringS.length() + 1][stringT.length() + 1];

			for (int i = 1; i <= stringS.length(); i++) {
				for (int j = 1; j <= stringT.length(); j++) {
					if (stringS.charAt(i - 1) == stringT.charAt(j - 1)) {
						if (lengthArray[i - 1][j - 1] == null) {
							lengthArray[i - 1][j - 1] = "";
						}
						lengthArray[i][j] = lengthArray[i - 1][j - 1] + stringS.charAt(i - 1);
					} else {
						if (lengthArray[i][j - 1] == null) {
							lengthArray[i][j - 1] = "";
						}
						if (lengthArray[i - 1][j] == null) {
							lengthArray[i - 1][j] = "";
						}
						lengthArray[i][j] = lengthArray[i][j - 1].length() > lengthArray[i - 1][j].length()
								? lengthArray[i][j - 1]
								: lengthArray[i - 1][j];
					}
				}

			}

			System.out.println(lengthArray[stringS.length()][stringT.length()]);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}