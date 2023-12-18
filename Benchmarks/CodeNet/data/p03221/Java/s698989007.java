import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();

		int[][] posArr = new int[M][2];
		for (int i = 0; i < M; i++) {
			posArr[i][0] = scanner.nextInt();
			posArr[i][1] = scanner.nextInt();
		}

		Map<Integer, ArrayList<Integer>> map = new HashMap<>();

		ArrayList<Integer> tmpList = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			if (map.containsKey(posArr[i][0])) {
				map.get(posArr[i][0]).add(posArr[i][1]);
			} else {
				tmpList = new ArrayList<Integer>();
				tmpList.add(posArr[i][1]);
				map.put(posArr[i][0], tmpList);
			}
		}

		for (Integer key : map.keySet()) {
			ArrayList<Integer> list = map.get(key);
			Collections.sort(list);
			map.put(key, list);
		}

		int key = 0;
		int val = 0;
		for (int i = 0; i < M; i++) {
			key = posArr[i][0];
			val = posArr[i][1];
			System.out.println(layout(key, map.get(key).indexOf(val) + 1));
		}
	}

	private static String layout(int val1, int val2) {
		StringBuffer stringBuffer = new StringBuffer();
		int leftCount = 6 - Integer.toString(val1).length();
		for (int i = 0; i < leftCount; i++) {
			stringBuffer.append("0");
		}
		stringBuffer.append(val1);

		int rigthCount = 12 - Integer.toString(val2).length();
		for (int i = 6; i < rigthCount; i++) {
			stringBuffer.append("0");
		}
		stringBuffer.append(val2);

		return stringBuffer.toString();
	}
}