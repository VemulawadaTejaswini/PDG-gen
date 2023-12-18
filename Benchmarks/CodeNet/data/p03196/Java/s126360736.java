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
		Map<Integer, Integer> m = new HashMap<>();
		m = decomp(P, p);
		long ans = 1L;
		for (Map.Entry<Integer,Integer> e :m.entrySet()) {
			long key = e.getKey(), value = e.getValue();
			ans *= (long)(Math.pow(key, value / N) + 0.5);
		}
		System.out.println(ans);
	}

	Map<Integer, Integer> decomp(long P, List<Long> p) {
		Map<Integer, Integer> m = new HashMap<>();
		for (int i=0; i < p.size() && P > 1; ++i) {
			long pi = p.get(i);
			while (P % pi == 0) {
				if (m.get((int)pi) == null) {
					m.put((int)pi, 0);
				}
				m.put((int)pi, m.get((int)pi) + 1);
				P /= pi;
			}
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