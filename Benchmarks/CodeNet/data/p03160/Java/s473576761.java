import java.util.*;

public class Main {
	int N;
	List<Integer> h;
	long[] costs;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		h = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			h.add(in.nextInt());
		}
		in.close();

		costs = new long[N];
		costs[0] = 0;
		costs[1] = Math.abs(h.get(1) - h.get(0));
	}

	void calc() {
		for (int i = 2; i < N; ++i) {
			costs[i] = Math.min(costs[i - 2] + Math.abs(h.get(i) - h.get(i - 2)),
					costs[i - 1] + Math.abs(h.get(i) - h.get(i - 1)));
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.costs[ins.N - 1]);
	}

}