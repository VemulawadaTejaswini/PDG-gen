import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		Map<String, Integer> map = new HashMap<String, Integer>();
		try {
			sc = new Scanner(System.in);
			String[] sentence = sc.nextLine().split(" ");

			for (String s : sentence) {
				map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
			}
			String maxFrequencyWord = "";
			int maxFrequency = Collections.max(map.values());
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if (maxFrequency == entry.getValue()) {
					maxFrequencyWord = entry.getKey();
				}
			}

			String maxLengthWord = Collections.max(map.keySet(),
					new Comparator<String>() {
						@Override
						public int compare(String o1, String o2) {
							return o1.length() - o2.length();
						}
					});

			System.out.println(maxFrequencyWord + " " + maxLengthWord);

		} finally {
			sc.close();
		}
	}
}