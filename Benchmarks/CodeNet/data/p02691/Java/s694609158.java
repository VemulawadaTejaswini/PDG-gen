import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int ans = 0;
		Map<Integer, HashSet<Integer>> L = new HashMap<Integer, HashSet<Integer>>();
		Map<Integer, HashSet<Integer>> R = new HashMap<Integer, HashSet<Integer>>();
		for (int i = 0; i < N; i++) {
			int l = i + A[i] + 1;
			int r = i - A[i] + 1;
			HashSet<Integer> newSetL = L.getOrDefault(l, new HashSet<Integer>());
			newSetL.add(i);
			L.put(l, newSetL);
			if (r > 0) {
				HashSet<Integer> newSetR = R.getOrDefault(r, new HashSet<Integer>());
				newSetR.add(i);
				R.put(r, newSetR);
			}
		}
		for (Entry<Integer, HashSet<Integer>> entry : L.entrySet()) {
			int l = entry.getKey();
			HashSet<Integer> setL = entry.getValue();
			HashSet<Integer> setR = R.getOrDefault(l, new HashSet<Integer>());
			ans += countPair(setL, setR);
		}
		System.out.println(ans);
	}

	public static int countPair(HashSet<Integer> setL, HashSet<Integer> setR) {
		int count = 0;
		for (int l : setL) {
			if (setR.contains(l)) {
				count += setR.size() - 1;
			} else {
				count += setR.size();
			}
		}
		return count;
	}
}
