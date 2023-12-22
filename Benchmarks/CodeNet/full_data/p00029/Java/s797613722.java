import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> h = new HashMap<String, Integer>();
		String[] str = sc.nextLine().split(" ");
		String max = "";
		for (int i = 0; i < str.length; i++) {
			if (max.length() < str[i].length())
				max = str[i];
			if (h.containsKey(str[i]))
				h.put(str[i], h.get(str[i]) + 1);
			else
				h.put(str[i], 1);
		}
		int maxCnt = 0;
		String maxCntWord = "";
		for (String s : h.keySet()) {
			if (maxCnt < h.get(s)) {
				maxCnt = h.get(s);
				maxCntWord = s;
			}
		}
		System.out.println(maxCntWord + " " + max);
	}

}