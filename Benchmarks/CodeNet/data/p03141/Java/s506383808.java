import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		sc.nextLine();
		final Map<Integer, Long> A = new HashMap<>();
		final Map<Integer, Long> B = new HashMap<>();
		final boolean[] selected = new boolean[N];

		for (int i = 0; i < N; i++) {
			final String line = sc.nextLine();
			final String[] split = line.split(" ");
			final long prefA = Long.parseLong(split[0]);
			final long prefB = Long.parseLong(split[1]);

			A.put(i, prefA);
			B.put(i, prefB);
			selected[i] = false;
		}

		List<Map.Entry<Integer, Long>> sortedA = A.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(new ValueComparator()))
				.collect(Collectors.toCollection(LinkedList::new));
		
		List<Map.Entry<Integer, Long>> sortedB = B.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(new ValueComparator()))
				.collect(Collectors.toCollection(LinkedList::new));

		long takahashi = 0;
		long aoki = 0;

		int numTrials = 0;
		while (numTrials < N) {
			boolean t = (numTrials % 2) == 0;
			
			Map.Entry<Integer, Long> maxT = getHighest(N, sortedA, selected);
			Map.Entry<Integer, Long> nextT = getSecondHighest(N, sortedA, selected);
			long prefMaxT = maxT.getValue();
			long prefNextT = (nextT == null) ? 0 : nextT.getValue();
			long expT = prefMaxT - prefNextT;
			
			Map.Entry<Integer, Long> maxA = getHighest(N, sortedB, selected);
			Map.Entry<Integer, Long> nextA = getSecondHighest(N, sortedB, selected);
			long prefMaxA = maxA.getValue();
			long prefNextA = (nextA == null) ? 0 : nextA.getValue();
			long expA = prefMaxA - prefNextA;

			if (t) {
				if (expT > expA) {
					takahashi += prefMaxT;
					selected[maxT.getKey()] = true;
				} else {
					final int key = maxA.getKey();
					takahashi += A.get(key);
					selected[key] = true;
				}
			} else {
				if (expA > expT) {
					aoki += prefMaxA;
					selected[maxA.getKey()] = true;
				} else {
					final int key = maxT.getKey();
					aoki += B.get(key);
					selected[key] = true;
				}
			}

			numTrials++;
		}

		System.out.println(takahashi - aoki);
	}
	
	private static Map.Entry<Integer, Long> getHighest(int N, List<Map.Entry<Integer, Long>> prefs, boolean[] selected) {
		for (int i = 0; i < N; i++) {
			final Map.Entry<Integer, Long> e = prefs.get(i);
			final boolean sel = selected[e.getKey()];
			
			if (!sel) {
				return e;
			}
		}
		
		return null;
	}
	
	private static Map.Entry<Integer, Long> getSecondHighest(int N, List<Map.Entry<Integer, Long>> prefs, boolean[] selected) {
		boolean firstFound = false;
		for (int i = 0; i < N; i++) {
			final Map.Entry<Integer, Long> e = prefs.get(i);
			final boolean sel = selected[e.getKey()];
			
			if (!sel) {
				if (firstFound) {
					return e;
				} else {
					firstFound = true;
				}
			}
		}
		
		return null;
	}
	
}

class ValueComparator implements Comparator<Long> {

	@Override
	public int compare(Long o1, Long o2) {
		return Long.compare(o2, o1);
	}

}