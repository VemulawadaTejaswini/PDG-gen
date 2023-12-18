import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		// solver.solve();
	}
}

class Solver {
	int N;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;

		HashMap<Integer, Integer> even = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> odd = new HashMap<Integer, Integer>();

		String[] strArr = str.split(" ");
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(strArr[i]);
			if (i % 2 == 0) {
				if (even.containsKey(a))
					even.put(a, even.get(a) + 1);
				else
					even.put(a, 1);
			} else {
				if (odd.containsKey(a))
					odd.put(a, odd.get(a) + 1);
				else
					odd.put(a, 1);
			}
		}
		List<Entry<Integer, Integer>> evenlist = new ArrayList<Entry<Integer, Integer>>(even.entrySet());
		List<Entry<Integer, Integer>> oddlist = new ArrayList<Entry<Integer, Integer>>(odd.entrySet());
		Collections.sort(evenlist, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		Collections.sort(oddlist, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		if (evenlist.get(0).getKey() != oddlist.get(0).getKey()) {
			int ans = N / 2 - evenlist.get(0).getValue();
			ans += N / 2 - oddlist.get(0).getValue();
			System.out.println(ans);
		} else if (evenlist.size() == 1 && oddlist.size() == 1) {
			System.out.println(N / 2);
		} else if (evenlist.size() == 1 && oddlist.size() > 1) {
			int ans = N / 2 - oddlist.get(1).getValue();
			System.out.println(ans);
		} else if (evenlist.size() > 1 && oddlist.size() == 1) {
			int ans = N / 2 - evenlist.get(1).getValue();
			System.out.println(ans);
		} else if (evenlist.get(0).getValue() == oddlist.get(0).getValue()) {
			if (evenlist.get(1).getValue() > oddlist.get(1).getValue()) {
				int ans = N / 2 - evenlist.get(1).getValue();
				ans += N / 2 - oddlist.get(0).getValue();
				System.out.println(ans);
			} else {
				int ans = N / 2 - evenlist.get(0).getValue();
				ans += N / 2 - oddlist.get(1).getValue();
				System.out.println(ans);
			}
		} else if (evenlist.get(0).getValue() > oddlist.get(0).getValue()) {
			int ans = N / 2 - evenlist.get(0).getValue();
			ans += N / 2 - oddlist.get(1).getValue();
			System.out.println(ans);
		} else {
			int ans = N / 2 - evenlist.get(1).getValue();
			ans += N / 2 - oddlist.get(0).getValue();
			System.out.println(ans);
		}

		// for (int key : even.keySet())
		// System.out.println(key + " " + even.get(key));
		// System.out.println();
		// for (int key : odd.keySet())
		// System.out.println(key + " " + odd.get(key));
	}

	public void solve() {

	}
}
