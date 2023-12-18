import java.util.*;
import java.io.*;

class Town{
	int id, num;

	public Town(int id, int num ) {
		super();
		this.id = id;
		this.num = num;
	}
	
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt();
		Map<Integer,TreeSet<Town>> map = new HashMap<>();
		for(int i=0;i<m;i++) {
			int p = fs.nextInt()-1, y = fs.nextInt();
			Town t = new Town(i,y);
			if(!map.containsKey(p)) {
				map.put(p, new TreeSet<Town>((t1,t2)->t1.num - t2.num));
				map.get(p).add(t);
			}
			else {
				map.get(p).add(t);
			}
		}
		int ans[][] = new int[m][2];
		for(int i=0;i<n;i++) {
			if(map.containsKey(i)) {
				TreeSet<Town> set = map.get(i);
				int cnt = 1;
				while(!set.isEmpty()) {
					Town t = set.pollFirst();
					ans[t.id][0]=i+1;
					ans[t.id][1]=cnt;
					cnt++;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<m;i++) {
			String l = String.format("%06d", ans[i][0]);
			String r = String.format("%06d", ans[i][1]);
			sb.append(l + r + "\n");
		}
		System.out.println(sb.toString());
		
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}