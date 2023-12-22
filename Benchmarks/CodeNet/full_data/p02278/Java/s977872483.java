import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


class Weight implements Comparable<Weight> {

	int num, prev;

	public Weight(int num, int prev) {
		super();
		this.num = num;
		this.prev = prev;
	}

	@Override
	public int compareTo(Weight o) {

		if (this.num < o.num) {
			return -1;
		}
		if (this.num > o.num) {
			return 1;
		}
		return 0;
	}
}

public class Main {


	public static Set<Weight> checked = new HashSet<>();

	public static int minCostChange(Weight[] arr, int i) {
		int useMin = 0, useOnlyRange = 0;

		Weight w = arr[i];
		int min = arr[0].num;
		List<Weight> list = new ArrayList<>();
		list.add(w);
		useMin += min + w.num;
		useOnlyRange += w.num;
		checked.add(w);
		while(i != w.prev) {
			w = arr[w.prev];
			list.add(w);
			useMin += min + w.num;
			useOnlyRange += w.num;
			checked.add(w);
		}
		Collections.sort(list);
		useMin += min + list.get(0).num;
		useOnlyRange += list.get(0).num * (list.size() - 2);
		return Math.min(useMin, useOnlyRange);
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Weight[] arr = new Weight[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Weight(sc.nextInt(), i);
		}
		Arrays.sort(arr);

		int min = arr[0].num;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i].prev != i && !checked.contains(arr[i])) {
				sum += minCostChange(arr, i);
			}
		}

		System.out.println(sum);
	}
}

