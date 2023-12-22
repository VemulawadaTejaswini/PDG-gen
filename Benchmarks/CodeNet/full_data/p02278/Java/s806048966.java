import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	final boolean DEBUG = false;
	final int INF = Integer.MAX_VALUE;

	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] w = new int[n];
		int[] a = new int[n];
		int[] _a = new int[n];
		int[] rank = new int[n];
		for (int i = 0; i < n; i++)
			rank[i] = INF;
		for (int i = 0; i < n; i++)
			a[i] = w[i] = scan.nextInt();
		Arrays.sort(a);
		int min = a[0];
		for (int i = 0; i < n; i++)
			_a[i] = Arrays.binarySearch(a, w[i]);
		if (DEBUG) {
			System.out.println(Arrays.toString(w));
			System.out.println(Arrays.toString(_a));
			System.out.println(Arrays.toString(a));
		}
		int index = 0;
		for (int i = 0; i < n; i++) {
			int idx = i;
			if (rank[i] != INF)
				continue;
			while (rank[i] == INF) {
				rank[_a[idx]] = index;
				idx = _a[idx];
			}
			index++;
		}
		if (DEBUG)
			System.out.println(Arrays.toString(rank));
		HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		for (int i = 0; i < n; i++) {
			LinkedList<Integer> list = map.get(rank[i]);
			if (list == null) {
				LinkedList<Integer> l = new LinkedList<Integer>();
				l.add(w[i]);
				map.put(rank[i], l);
			} else {
				list.add(w[i]);
				map.put(rank[i], list);
			}
		}
		if (DEBUG) {
			System.out.println(map.size());
			for (int i = 0; i < map.size(); i++) {
				LinkedList<Integer> list = map.get(i);
				System.out.println("map " + i + ": " + list.toString());
			}
		}
		int ans = 0;
		for (int i = 0; i < map.size(); i++) {
			LinkedList<Integer> list = map.get(i);
			if (list.size() == 1)
				continue;
			int sum = 0;
			int m = INF;
			int length = list.size();
			for (int j = 0; j < length; j++) {
				int num = list.get(j);
				sum += num;
				m = Math.min(m, num);
			}
			if (DEBUG)
				System.out.println(sum + " " + m + " " + ((length + 1) * min));
			ans += Math.min(sum + (length - 2) * m, sum + m + (length + 1) * min);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

