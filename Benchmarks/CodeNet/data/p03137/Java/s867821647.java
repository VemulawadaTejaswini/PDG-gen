import java.util.*;

public class Main {
	static class Diff {
		int index;
		int length;

		Diff(int index, int length) {
			this.index = index;
			this.length = length;
		}
	}

	int N, M;
	List<Integer> X;
	List<Diff> diffs;
	Comparator<Diff> comp = new Comparator<Diff>() {
		@Override
		public int compare(Diff o1, Diff o2) {
			if (o1.length < o2.length) {
				return 1;
			} else if (o1.length > o2.length) {
				return -1;
			} else {
				return 0;
			}
		}
	};

	void calcDiff() {
		diffs = new ArrayList<>(M - 1);
		for (int i = 0; i < M - 1; ++i) {
			diffs.add(new Diff(i, X.get(i + 1) - X.get(i)));
		}
		Collections.sort(diffs, comp);
	}

	long calc() {
		if (N >= M) {
			return 0;
		}
		long sum = X.get(X.size() - 1) - X.get(0);
		for (int i = 0; i < N - 1; ++i) {
			sum -= diffs.get(i).length;
		}
		return sum;
	}

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		X = new ArrayList<>(M);
		tokens = in.nextLine().split(" ");
		for (int i = 0; i < M; ++i) {
			X.add(Integer.parseInt(tokens[i]));
		}
		in.close();
		Collections.sort(X);
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calcDiff();
		System.out.println(ins.calc());
	}

}
