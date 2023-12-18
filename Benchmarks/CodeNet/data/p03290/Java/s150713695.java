
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	static String original;
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int D = reader.nextInt();
		int G = reader.nextInt();
		SortedMap<Integer, int[]> map = new TreeMap<Integer, int[]>();
		ArrayList<Integer> sortedN = new ArrayList<Integer>();

		for (int i = 1; i <= D; i++) {
			int n = reader.nextInt();
			int gp = reader.nextInt();
			int[] arr = new int[2];
			arr[0] = n;
			arr[1] = n * 100 * i + gp;
			map.put(i * 100, arr);
			sortedN.add(n);
		}
		Collections.sort(sortedN);
		int ans = 0;


		while (G > 0) {
			int maxNoComplete = map.lastKey() * (sortedN.get(0) - 1);
			Entry<Integer, int[]> maxEntry = getEntryOfEffectiveQuestion(map, G);
			int tmp = G / map.lastKey();
			if (G % map.lastKey() != 0) {
				tmp += 1;
			}
			if (maxNoComplete > G || ((maxEntry.getValue()[1] / maxEntry.getValue()[0]) <= map.lastKey() &&
					tmp < maxEntry.getValue()[0])) {
				ans += tmp;
				G = 0;
			} else {
				ans += maxEntry.getValue()[0];
				sortedN.removeIf(s-> s.equals(maxEntry.getValue()[0]));
				G -= maxEntry.getValue()[1];
				map.remove(maxEntry.getKey());
			}
		}

		System.out.print(ans);
		reader.close();
	}

	public static Entry<Integer, int[]> getEntryOfEffectiveQuestion(SortedMap<Integer, int[]> map, int G) {
		Entry<Integer, int[]> complete = (Entry<Integer, int[]>) map.entrySet().toArray()[0];
		boolean isCompletedByOne = false;
		int min = 11;
		for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
			if (G <= entry.getValue()[1]) {
				if (entry.getValue()[0] < min) {
					isCompletedByOne = true;
					complete = entry;
					min = entry.getValue()[0];
				}
			}
		}

		if (!isCompletedByOne) {
			double max = 0.0;
			for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
				double per = 1.0 *  entry.getValue()[1] / entry.getValue()[0];
				if (per > max) {
					max = per;
					complete = entry;
				}
			}
		}
		return complete;
	}


}
