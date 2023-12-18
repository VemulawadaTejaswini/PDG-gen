import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		new Caddi2018().c();
	}
}

class Caddi2018 {
	void c()throws IOException {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong(), P = in.nextLong();
		final int MAXSQRT_N = 2000000;
		List<Long> p = eratos(MAXSQRT_N);
		Map<Long, Long> m = new HashMap<>();
		m = decomp(P, p);
		long ans = 1L;
		for (Map.Entry<Long, Long> e :m.entrySet()) {
			long key = e.getKey(), value = e.getValue();
			ans *= (long)(Math.pow(key, value / N));
		}
		System.out.println(ans);
	}

	Map<Long, Long> decomp(long P, List<Long> p) {
		long Q = P;
		Map<Long, Long> m = new HashMap<>();
		for (int i=0; i < p.size() && Q > 1L; ++i) {
			long pi = p.get(i);
			while (Q % pi == 0L) {
				if (m.get(pi) == null) {
					m.put(pi, 0L);
				}
				m.put(pi, m.get(pi) + 1L);
				Q /= pi;
			}
		}
		if (Q > 1L) {
			m.put(Q, 1L);
		}
		return m;
	}

	List<Long> eratos(int N) {
		boolean[] isP = new boolean[N + 1];
		Arrays.fill(isP, true);
		isP[0] = isP[1] = false;
		for (int i=4; i <= N; i += 2) {
			isP[i] = false;
		}
		for (int i=3; i <= N; i += 2) {
			for (int j=i + i; j <= N; j += i) {
				isP[j] = false;
			}
		}
		List<Long> p = new ArrayList<>();
		for (int i=0; i < N; ++i) {
			if (isP[i]) {
				p.add((long)i);
			}
		}
		return p;
	}
}