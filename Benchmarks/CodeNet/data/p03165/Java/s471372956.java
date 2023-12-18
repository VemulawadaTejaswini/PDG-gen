
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solveA();
		// new Main().solveB();
		// new Main().solveC();
		// new Main().solveD();
	}

	char[] sArray;
	char[] tArray;

	List<String> wkList = new ArrayList<String>();
	Map<String, String> wkMap = new HashMap<String, String>();
	int preMatchNumT = 0;

	private String isMatch(int currentSI, int nextSartT) {

		String key = currentSI + ":" + nextSartT;
		if (wkMap.containsKey(key)) {
			return wkMap.get(key);
		}
		StringBuilder builder = new StringBuilder();
		if (sArray[currentSI] == tArray[nextSartT]) {
			builder.append(sArray[currentSI]);
			preMatchNumT = nextSartT;
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
				wkS2 = isMatch(currentSI + 1, 0);
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

			for (int i = 0; i < sArray.length; i++) {
				wkList.add(isMatch(i, 0));
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
}