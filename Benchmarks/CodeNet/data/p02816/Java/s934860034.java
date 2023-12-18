import java.util.*;
class Main {
	Scanner sc;
	int N;
	int[] a, b, c, d;
	int base;
	static final Set<Integer> PRIMES;
	static {
		PRIMES = new TreeSet<>();
		int n = (int)Math.sqrt(200000);
		for (int i = 1; i <= n; i++) {
			int m = (int)Math.sqrt(i);
			int j = 2;
			for (; j <= m; j++)
				if (i%j == 0) break;
			if (j > m) PRIMES.add(i);
		}
	}
	
	static Comparator<int[]> comp = Comparator.comparingInt(e -> e[0]);
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		a = new int[N];
		b = new int[N];
		c = new int[N];
		d = new int[N];
		for (int i = 0; i < N; i++) a[i] = sc.nextInt();
		for (int i = 0; i < N; i++)	b[i] = sc.nextInt();
		for (int i = 0; i < N; i++) c[i] = a[i] ^ a[(i+1)%N];
		for (int i = 0; i < N; i++) d[i] = b[i] ^ b[(i+1)%N];
		
		int[][] cmap = new int[N][2];
		for (int i = 0; i < N; i++) { cmap[i][0] = c[i]; cmap[i][1] = i; }
		Arrays.sort(cmap, comp);
		int s = 0;
		int min = Integer.MAX_VALUE;
		int minv = -1;
		int cnt = 1;
		int idx = -1;
		for (int i = 0; i < N; i++) {
			if (i == N-1 || cmap[i][0] != cmap[i+1][0]) {
				if (cnt < min) {
					min = cnt;
					minv = cmap[i][0];
					idx = s;
				}
				s = i;
				cnt = 0;
			}
			cnt++;
		}
		int[][] dmap = new int[N][2];
		for (int i = 0; i < N; i++) { dmap[i][0] = d[i]*2; dmap[i][1] = i; }
		Arrays.sort(dmap, comp);
		int didx = -1-Arrays.binarySearch(dmap, 0, N, new int[] {2*minv-1}, comp);
		int dcnt = -1-Arrays.binarySearch(dmap, 0, N, new int[] {2*minv+1}, comp)-didx;
		base = -1;
	lp:
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < dcnt; j++) {
				int k = 0;
				for (; k < N; k++)
					if (c[(cmap[i+idx][1]+k)%N] != d[(dmap[j+didx][1]+k)%N]) break;
				if (k == N) {
					base = (N+cmap[i+idx][1]-dmap[j+didx][1])%N;
					break lp;
				}
			}
		}
		if (base == -1) return;
		
		Set<Integer> divs = new TreeSet<>();
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if ((N%i)!=0) continue;
			if (PRIMES.contains(i)) divs.add(i);
			if (PRIMES.contains(N/i)) divs.add(N/i);
		}
		Map<Integer, Integer> ans = new TreeMap<>();
		ans.put( base, a[base]^b[0] );
		for (int div : divs) {
			if (ans.containsKey(div)) continue;
			if (checkSeq(div))
				for (int i = div; i <= N; i += div)
					ans.put( (base+i)%N, a[(base+i)%N]^b[0] );
		}
		for (int k : ans.keySet()) System.out.println(k+" "+ans.get(k));
	}
	
	private boolean checkSeq(int div) {
		if (div == N) return true;
		for (int i = 0; i < N; i++)
			if (c[i] != c[(i+div)%N]) return false;
		return true;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
