import java.util.*;

public class Main {
	int K, N;
	List<Long> h;
	long result;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		K = in.nextInt();
		h = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			h.add(in.nextLong());
		}
		in.close();

		Collections.sort(h);
	}

	void calc() {
		long diff = Long.MAX_VALUE;
		for (int i = 0; i + K <= N; ++i) {
			int largeIndex = i + K - 1;
			if (diff > h.get(largeIndex) - h.get(i)) {
				diff = h.get(largeIndex) - h.get(i);
			}
		}
		result = diff;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}

}