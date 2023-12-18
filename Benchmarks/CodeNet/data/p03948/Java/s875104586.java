import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), t = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		SegTree st = new SegTree(n);
		for(int i=0;i<n;i++) {
			st.update(i,a[i]);
		}
		
		int max = 0;
		List<Integer> sels = new ArrayList<>(),  buys = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int buy = a[i];
			int sel = st.getMax(i+1, n, 0, 0, -1);
			if(sel-buy>max) {
				max = sel - buy;
				sels = new ArrayList<>();
				buys = new ArrayList<>();
				sels.add(sel);
				buys.add(buy);
			}
			else if(sel - buy == max) {
				sels.add(sel);
				buys.add(buy);
			}
		}
		Map<Integer,Integer> smp = new HashMap<>();
		for(int tmp:sels) {
			if(smp.containsKey(tmp))smp.put(tmp, smp.get(tmp)+1);
			else smp.put(tmp, 1);
		}
		Map<Integer,Integer> bmp = new HashMap<>();
		for(int tmp:buys) {
			if(bmp.containsKey(tmp))bmp.put(tmp, bmp.get(tmp)+1);
			else bmp.put(tmp, 1);
		}
		
		int ans = 0;
		for(int key:smp.keySet()) {
			int snum = smp.get(key);
			int bnum = bmp.get(key-max);
			int min = Math.min(snum, bnum);
			ans += min;
		}
		
		System.out.println(ans);
		
	}
}

class SegTree{
	int n;
	int seg[];
	SegTree(int k){
		n = 1;
		while(n<k)n*=2;
		seg = new int[2*n-1];
	}
	
	int getMax(int x, int y, int k, int l, int r){
		if(r < 0)r = n;
		if(x>=r||y<=l)return -1;
		if(x<=l&&y>=r)return seg[k];
		int res = 0;
		res = Math.max(res, getMax(x,y,2*k+1,l,(l+r)/2));
		res = Math.max(res, getMax(x,y,2*k+2,(l+r)/2,r));
		return res;
	}
	
	void update(int i, int v) {
		i += (n-1);
		seg[i] = v;
		while(i>0) {
			i = (i-1)/2;
			seg[i] = Math.max(seg[2*i+1], seg[2*i+2]);
		}
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