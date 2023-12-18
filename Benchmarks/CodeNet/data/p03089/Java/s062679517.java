import java.util.*;

public class Main {
	static class Sub {
		List<Integer> vals = new ArrayList<>();

		boolean isEnable() {
			boolean result = true;
			for (int i = 0; i < vals.size(); ++i) {
				if (vals.get(i) > i + 1) {
					result = false;
					break;
				}
			}
			return result;
		}

		List<Integer> getInputs() {
			Collections.sort(vals);
			return vals;
		}
	}

	Deque<Integer> dfs(List<Integer> vals, Deque<Integer> prevs) {
		if (vals.size() == 1) {
			if (vals.get(0) == 1) {
				prevs.addFirst(vals.get(0));
				return prevs;
			} else {
				return null;
			}
		}
		boolean result = false;
		for (int i = vals.size() - 1; i >= 0; --i) {
			if (vals.get(i) == i + 1) {
				// この要素を取り除ける
				List<Integer> remain = new ArrayList<>(N);
				remain.addAll(vals.subList(0, i));
				remain.addAll(vals.subList(i + 1, vals.size()));
				prevs.addFirst(vals.get(i));
				Deque<Integer> remainResult = dfs(remain, prevs);
				if (remainResult != null) {
					result = true;
					break;
				} else {
					prevs.removeFirst();
				}
			}
		}
		if (result) {
			return prevs;
		} else {
			return null;
		}
	}

	int N;
	int[] b;
	boolean isEnable = false;
	Deque<Sub> subs = new ArrayDeque<>();

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		b = new int[N];
		for (int i = 0; i < N; ++i) {
			b[i] = in.nextInt();
		}
		in.close();
	}

	boolean isEnable() {
		for (int i = 0; i < N; ++i) {
			if (b[i] > i + 1) {
				return false;
			}
		}
		return true;
	}

	void calc() {
		List<Integer> vals = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			vals.add(b[i]);
		}

		Deque<Integer> result = this.dfs(vals, new ArrayDeque<Integer>());
		if (result != null) {
			while (!result.isEmpty()) {
				System.out.println(result.pollFirst());
			}
		} else {
			System.out.println("-1");
		}
	}

	void show() {
		List<Integer> inputs = new ArrayList<>();
		while (!this.subs.isEmpty()) {
			Sub sub = this.subs.pollLast();
			inputs.addAll(sub.getInputs());
		}
		for (int i = 0; i < inputs.size(); ++i) {
			System.out.println(inputs.get(i));
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
	}
}