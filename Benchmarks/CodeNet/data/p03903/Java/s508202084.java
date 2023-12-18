
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] from = new int[M];
		int[] to = new int[M];
		int[] cost = new int[M];
		Map<Integer, Integer> costMap = new HashMap<>();
		for (int i = 0; i < M; i ++) {
			from[i] = sc.nextInt() - 1;
			to[i] = sc.nextInt() - 1;
			cost[i] = sc.nextInt();
			costMap.put(from[i] + to[i] * 4000, cost[i]);
			costMap.put(to[i] + from[i] * 4000, cost[i]);
		}
		int Q = sc.nextInt();
		int[][][] g = packWU(N, from, to, cost);
		int[] p = prim(g, 0);
		int[][] g2 = parentToG(p);
		
		int[][] len = new int[N][N];
		for (int i = 0; i < N; i ++) {
			dfs(i, -1, g2, len[i], costMap, 0);
		}
		long total = 0;
		for (int i = 0; i < N; i ++) {
			if (p[i] >= 0) {
				total += costMap.get(p[i] + i * 4000);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Q; i ++) {
			int S = sc.nextInt() - 1;
			int T = sc.nextInt() - 1;
			
			sb.append(total - len[S][T]);
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	private static void dfs(int i, int prev, int[][] g, int[] len, Map<Integer, Integer> costMap, int max) {
		len[i] = max;
		for (int to : g[i]) {
			if (to != prev) {
				dfs(to, i, g, len, costMap, Math.max(max, costMap.get(i + to * 4000)));
			}
		}
	}

	public static int[][] parentToG(int[] par)
	{
		int n = par.length;
		int[] ct = new int[n];
		for(int i = 0;i < n;i++){
			if(par[i] >= 0){
				ct[i]++;
				ct[par[i]]++;
			}
		}
		int[][] g = new int[n][];
		for(int i = 0;i < n;i++){
			g[i] = new int[ct[i]];
		}
		for(int i = 0;i < n;i++){
			if(par[i] >= 0){
				g[par[i]][--ct[par[i]]] = i;
				g[i][--ct[i]] = par[i];
			}
		}
		return g;
	}
	
	public static int[] prim(int[][][] d, int from)
	{
		int n = d.length;
		final int[] td = new int[n];
		int[] prev = new int[n];
		Arrays.fill(prev, -1);
		Arrays.fill(td, Integer.MAX_VALUE / 3);
		BitSet visited = new BitSet();
		TreeSet<Integer> q = new TreeSet<Integer>(new Comparator<Integer>(){
			public int compare(Integer a, Integer b) {
				if(td[a] - td[b] != 0)return td[a] - td[b];
				return a - b;
			}
		});
		q.add(from);
		td[from] = 0;
		
		while(q.size() > 0){
			int cur = q.pollFirst();
			visited.set(cur);
			
			for(int[] tar : d[cur]) {
				int nex = tar[0];
				int nd = tar[1];
				if(!visited.get(nex)){
					if(nd < td[nex]){
						q.remove(nex);
						td[nex] = nd;
						prev[nex] = cur;
						q.add(nex);
					}
				}
			}
		}
		
		return prev;
	}
	
	public static int[][][] packWU(int n, int[] from, int[] to, int[] w)
	{
		int[][][] g = new int[n][][];
		int[] p = new int[n];
		for(int f : from)p[f]++;
		for(int t : to)p[t]++;
		for(int i = 0;i < n;i++)g[i] = new int[p[i]][2];
		for(int i = 0;i < from.length;i++){
			--p[from[i]];
			g[from[i]][p[from[i]]][0] = to[i];
			g[from[i]][p[from[i]]][1] = w[i];
			--p[to[i]];
			g[to[i]][p[to[i]]][0] = from[i];
			g[to[i]][p[to[i]]][1] = w[i];
		}
		return g;
	}
}



class FastScanner {
	public static String debug = null;

	private final InputStream in = System.in;
	private int ptr = 0;
	private int buflen = 0;
	private byte[] buffer = new byte[1024];
	private boolean eos = false;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				if (debug != null) {
					buflen = debug.length();
					buffer = debug.getBytes();
					debug = "";
					eos = true;
				} else {
					buflen = in.read(buffer);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen < 0) {
				eos = true;
				return false;
			} else if (buflen == 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean isEOS() {
		return this.eos;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		return (int) nextLong();
	}

	public long[] nextLongList(int n) {
		return nextLongTable(1, n)[0];
	}

	public int[] nextIntList(int n) {
		return nextIntTable(1, n)[0];
	}

	public long[][] nextLongTable(int n, int m) {
		long[][] ret = new long[n][m];
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ret[i][j] = nextLong();
			}
		}
		return ret;
	}

	public int[][] nextIntTable(int n, int m) {
		int[][] ret = new int[n][m];
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ret[i][j] = nextInt();
			}
		}
		return ret;
	}
}