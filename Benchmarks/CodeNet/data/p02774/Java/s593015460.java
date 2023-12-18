import java.util.*;
import java.io.*;

class Main {
	MScanner sc;
	int N;
	long K;
	int[] n, p;
	int nlen, plen;
	
	private void calc() {
		sc = new MScanner();
		N = sc.nextInt();
		K = sc.nextLong();
		List<Integer> ne = new ArrayList<>();
		List<Integer> po = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (a < 0) ne.add(a);
			else po.add(a);
		}
		nlen = ne.size();
		plen = po.size();
		n = new int[nlen];
		for (int i = 0; i < nlen; i++) n[i] = -ne.get(i);
		p = new int[plen];
		for (int i = 0; i < plen; i++) p[i] = po.get(i);
		Arrays.sort(n);
		Arrays.sort(p);
		
		long l = Long.MIN_VALUE / 2;
		long r = Long.MAX_VALUE / 2;

		while (l <= r) {
			long m = (l + r) >> 1;
			long[] mv = count(m);
			if (mv[0] < K) l = m + 1;
			else if (mv[0] > K) r = m - 1;
			else {
				System.out.println(mv[1]);
				return;
			}
		}
		System.out.println( l );
	}
	
	private long[] count(long t) {
		long s = 0;
		long max = Long.MIN_VALUE;
		if (t < 0) {
			int nr = nlen - 1;
			int pl = 0;
			for (; nr >= 0; nr--) {
				for (; pl < plen; pl++) {
					if ((long)n[nr]*p[pl] >= -t) break;
				}
				if (pl < plen) {
					s += plen - pl;
					max = Math.max(max, (long)-n[nr]*p[pl]);
				} else break;
			}
			return new long[] {s, max};
		} else {
			s = nlen * plen;
			int nl = 0;
			int nr = nlen - 1;
			for (; nl < nlen; nl++) {
				for (; nr > nl; nr--) {
					if ((long)n[nl]*n[nr] <= t) break;
				}
				if (nr > nl) {
					s += nr - nl;
					max = Math.max(max, (long)n[nl]*n[nr]);
				} else break;
			}
			int pl = 0;
			int pr = plen - 1;
			for (; pl < plen; pl++) {
				for (; pr > pl; pr--) {
					if ((long)p[pl]*p[pr] <= t) break;
				}
				if (pr > pl) {
					s += pr - pl;
					max = Math.max(max, (long)p[pl]*p[pr]);
				} else break;
			}
			return new long[] {s, max};
		}

	}
	static class MScanner {
		BufferedReader br;
		String[] tokens;
		int cursor;
		
		MScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() { return fetch(); }
		int nextInt() { return Integer.parseInt(fetch()); }
		long nextLong() { return Long.parseLong(fetch()); }
		double nextDouble() { return Double.parseDouble(fetch()); }
		
		String fetch() {
			if (tokens == null || cursor >= tokens.length) readNext();
			String r = tokens[cursor++];
			return r;
		}

		void readNext() {
			try {
				String line = br.readLine();
				if (line == null || line.equals("")) br.close();
				else {
					tokens = line.split(" ");
					cursor = 0;
				}
			} catch (IOException ioe) {
				throw new RuntimeException(ioe);
			}
		}

		public void finalize() throws Exception {
			if (br != null) br.close();
		}
	}
	public static void main(String[] args) {
		new Main().calc();
	}
}
	
