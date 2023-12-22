import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap();
		String st;
		String longWord;
		String freqWord;
		int maxLength;
		int maxFreq;

		longWord = null;
		freqWord = null;
		maxLength = 0;
		maxFreq = 0;
		while (sc.hasNext()) {
			st = sc.next();
			if (map.get(st) == null) {
				map.put(st, 1);
			} else {
				map.put(st, map.get(st) + 1);
			}
			if (maxLength < st.length()) {
				maxLength = st.length();
				longWord = st;
			}
			if (maxFreq < map.get(st)) {
				maxFreq = map.get(st);
				freqWord = st;
			}
		}
		System.out.println(freqWord + " " + longWord);
	}
}