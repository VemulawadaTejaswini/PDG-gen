import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int N = fs.nextInt(), Q = fs.nextInt();
		int stop[][] = new int[N][3];
		for(int i=0;i<N;i++) {
			int s = fs.nextInt(), t = fs.nextInt(), x = fs.nextInt();
			stop[i][0] = s;
			stop[i][1] = t; //通行止は[s,t)と解釈して良い。
			stop[i][2] = x;			
		}
		int D[] = new int[Q];
		for(int i=0;i<Q;i++)D[i] = fs.nextInt();
		
		//sをxの降順でソート
		Arrays.sort(stop, (s1, s2)-> s2[2]-s1[2]);
		
		TreeMap<Integer,Integer> tm = new TreeMap<>(); 
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<N;i++) {
			int s = stop[i][0];
			int t = stop[i][1];
			int x = stop[i][2];
			
			while(tm.floorKey(t-1-x)!=null) {
				int a = tm.floorKey(t-1-x);
				int b = hm.get(a);//aの相方
				
				if(s-x<=a) {
					if(s-x<=b&&b<=t-1-x) {
						tm.remove(a);
						tm.remove(b);
					}else if(b<s-x) {
						tm.remove(a);
						int tx = tm.get(b);
						tm.put(s-x-1, tx); //hmはもう使わないので更新不要
					}else {
						tm.remove(a);
						int tx = tm.get(b);
						tm.put(t-x, tx);
					}
				}
				else break;
			}
			
			tm.put(s-x,x);
			tm.put(t-1-x, x);
			hm.put(s-x, t-1-x);
			hm.put(t-1-x, s-x);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<Q;i++) {
			int q = D[i];
			if(tm.floorKey(q)==null || tm.ceilingKey(q)==null) {
				sb.append(-1 + "\n");
				continue;
			}
			int low = tm.floorKey(q);
			int hi = tm.ceilingKey(q);
			
			if(low!=hi) {
				sb.append(-1 + "\n");
				continue;
			}
			sb.append(tm.get(low)+ "\n");
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