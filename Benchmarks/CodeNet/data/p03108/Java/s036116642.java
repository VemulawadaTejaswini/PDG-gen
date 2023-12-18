import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();

		long nC2 = (long)n * (n-1) / 2;

		List<Set<Integer>> setList = new ArrayList<Set<Integer>>();
		long[] useful = new long[m + 1];
		useful[m] = 0L;
		for (int i = m - 1; i > 0; i--) {
			int ai = a[i];
			int bi = b[i];
			int aIdx = -1;
			int bIdx = -1;
			for (int j = 0; j < setList.size(); j++) {
				Set<Integer> set = setList.get(j);
				if (set.contains(ai)) {
					aIdx = j;
					break;
				}
			}
			for (int j = 0; j < setList.size(); j++) {
				Set<Integer> set = setList.get(j);
				if (set.contains(bi)) {
					bIdx = j;
					break;
				}
			}

			if (aIdx == -1 && bIdx == -1) {
				Set<Integer> set = new HashSet<Integer>();
				set.add(ai);
				set.add(bi);
				setList.add(set);
				useful[i] = useful[i + 1] + 1;

			} else if (aIdx != -1 && bIdx == -1) {
				Set<Integer> set = setList.get(aIdx);
				useful[i] = useful[i + 1] + set.size();
				set.add(bi);

			} else if (aIdx == -1 && bIdx != -1) {
				Set<Integer> set = setList.get(bIdx);
				useful[i] = useful[i + 1] + set.size();
				set.add(ai);

			} else if (aIdx != bIdx) {
				Set<Integer> setA = setList.get(aIdx);
				Set<Integer> setB = setList.get(bIdx);
				useful[i] = useful[i + 1] + setA.size() * setB.size();
				setA.addAll(setB);
				setList.remove(bIdx);
			} else {
				useful[i] = useful[i + 1];
			}
		}

		for (int i = 1; i <= m; i++) {
			System.out.println(nC2 - useful[i]);
		}
	}
}
