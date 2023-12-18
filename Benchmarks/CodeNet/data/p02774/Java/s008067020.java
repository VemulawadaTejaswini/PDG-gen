import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		long k = fs.nextInt();
	
		
		
		int a[] = fs.nextIntArray(n);
		Arrays.sort(a);
		
		List<Long> ms = new ArrayList<>();
		List<Long> ps = new ArrayList<>();
		
		long p = 0, m = 0, z = 0;
		for(int i=0;i<n;i++) {
			if(a[i]>0) {
				p++;
				ps.add((long)a[i]);
			}
			else if(a[i]<0) {
				m++;
				ms.add((long)a[i]);
			}
			else z++;
		}
		
		long mn = m * p;
		long zn = z * (n-z) + (long)z*(z-1)/2; 
		
		long ans = 0;
		
		Collections.sort(ms);
		Collections.sort(ps);
		
		long s = 0;
		for(long i=1;i<=n;i++) {
			if(i*(i-1)/2 < k && k <= (i+1)*i/2) {
				s = i;
				break;
			}
		}
		long rem = k - s*(s-1)/2;
		
		//kがマイナス
		if(k<=mn) {
			long cnt = k / p; //cnt番目までのマイナスを使う
			long pcnt = k / m;
			long t = cnt * pcnt;
			k -= t;
			List<Long> list = new ArrayList<>();
			long mt = ms.get((int)cnt);
			long pt = ps.get((int)pcnt);
			for(int i=0;i<k;i++) {
				list.add(mt*ps.get(i));
				list.add(pt*ms.get(i));
			}
			Collections.sort(list);
			ans = list.get((int)k);
			
		}
		else if(k<=mn + zn) {
			ans = 0;
		}
		else {
			k -= (mn + zn);
			List<Long> list = new ArrayList<>();
			if(ms.size()>=2) {
				boolean ok = false;
				for(int i=0;i < ms.size();i++) {
					for(int j=i+1;j<ms.size();j++) {
						list.add(ms.get(i) * ms.get(j));
						if(list.size() >= k)ok=true;
						if(ok)break;
					}
					break;
				}
			}
			
			int cnt = 0;
			if(ps.size()>=2) {
				boolean ok = false;
				for(int i=0;i < ps.size();i++) {
					for(int j=i+1;j<ps.size();j++) {
						list.add(ps.get(i) * ps.get(j));
						cnt++;
						if(cnt >= k)ok=true;
						if(ok)break;
					}
					break;
				}
			}
			Collections.sort(list);
			ans = list.get((int)k-1);
			
		}
		
		System.out.println(ans);
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