import java.util.*;

public class Main {
	int N;
	List<Long> A;
	long minA = Long.MAX_VALUE;
	Map<Long, Long> counts = new HashMap<>();
	long count = 0L;
	long result;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		A = new ArrayList<>(N);
		long v = in.nextLong();
		A.add(v);
		minA = Math.min(minA, v);
		long prev = v;
		for (int i = 1; i < N; ++i) {
			v = in.nextLong();
			A.add(v);
			minA = Math.min(minA, v);
			if (v <= prev) {
				count++;
				if (!counts.containsKey(v)) {
					counts.put(v, 1L);
				} else {
					counts.put(v, counts.get(v) + 1L);
				}
			}
			prev = v;
		}
		in.close();
	}

	void calc() {
		long r = -1L;
		for (Long key : counts.keySet()) {
			r = Math.max(r, counts.get(key));
		}
		r++;
		result = r;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println((ins.result));
	}

}