import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();

		HashMap<String, Integer> sFreq = new HashMap<>();
		HashMap<String, Integer> tFreq = new HashMap<>();

		String s, t;
		for (int i = 0; i < S.length() - 1; i++) {
			s = S.substring(i, i + 1);
			if (sFreq.containsKey(s)) {
				sFreq.put(s, sFreq.get(s) + 1);
			} else {
				sFreq.put(s, 1);
			}
		}
		for (int i = 0; i < T.length() - 1; i++) {
			t = T.substring(i, i + 1);
			if (tFreq.containsKey(t)) {
				tFreq.put(t, tFreq.get(t) + 1);
			} else {
				tFreq.put(t, 1);
			}
		}
		List<Integer> sFreqList = new ArrayList<>(sFreq.values());
		Collections.sort(sFreqList, Comparator.reverseOrder());

		List<Integer> tFreqList = new ArrayList<>(tFreq.values());
		Collections.sort(tFreqList, Comparator.reverseOrder());

		boolean match = true;
		for (int i = 0; i < sFreqList.size(); i++) {
			if (sFreqList.get(i) != tFreqList.get(i)) {
				match = false;
				break;
			}
		}

		System.out.println(match ? "Yes" : "No");
	}

}