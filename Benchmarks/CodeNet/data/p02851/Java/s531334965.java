import java.util.*;

class Main {
	static final Integer ZERO = Integer.valueOf(0);
	Scanner sc;
	int N, K;
	HashMap<Long, Integer> h;
	long[] S;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		S = new long[N+1];
		h = new HashMap<>(N*4/3);
		
		S[0] = 0;
		for (int i = 1; i < N+1; i++) S[i] = (S[i-1] + (sc.nextInt() - 1))%K;
		long cnt = 0;
		for (int i = 1; i < N+1; i++) {
			long r = S[i-1];
			h.put( r, h.getOrDefault(r, ZERO) + 1);
			if (i >= K) {
				r = S[i-K];
				int v = h.get(r);
				if (v > 1) h.put(r, v-1);
				else h.remove(r);
			}
			cnt += h.getOrDefault(S[i]%K, ZERO);
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
