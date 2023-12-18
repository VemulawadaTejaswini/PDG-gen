
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] p = new int[N];
			for (int i = 0; i < N; i++) {
				p[i] = sc.nextInt() - 1;
			}
			ArrayList<Set<Integer>> setList = new ArrayList<Set<Integer>>(M);
			for (int i = 0; i < M; i++) {
				Set<Integer> set = new HashSet<Integer>();
				set.add(sc.nextInt() - 1);
				set.add(sc.nextInt() - 1);
				setList.add(set);
			}

			// 初期の一致チェック
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (i == p[i]) {
					count++;
				}
			}
			if (count == N) {
				System.out.println(N);
				return;
			}

			mergeSet(setList);

			count = 0;
			Set<Integer> noChange = new HashSet<Integer>();
			for (int i = 0; i < N; i++) {
				noChange.add(i);
			}
			for (Set<Integer> set : setList) {
				for (Integer i : set) {
					if (set.contains(p[i])) {
						count++;
					}
					noChange.remove(i);
				}
			}
			for (int i : noChange) {
				if (i == p[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

	private static void mergeSet(ArrayList<Set<Integer>> setList) {

		boolean doMerge = false;
		TreeSet<Integer> delList = new TreeSet<Integer>();
		for (int i = 0; i < setList.size(); i++) {
			Set<Integer> tmp1 = setList.get(i);
			for (int j = i; j < setList.size(); j++) {
				Set<Integer> tmp2 = setList.get(j);
				if(tmp1 == tmp2) {
					continue;
				}
				if (tmp1.stream().anyMatch(tmp2::contains)) {
					doMerge = true;
					tmp1.addAll(tmp2);
					delList.add(j);
				}
			}
		}
		int delCount = 0;
		for (int i : delList) {
			setList.remove(i - delCount);
			delCount++;
		}
		if (doMerge) {
			mergeSet(setList);
		}
	}
}
