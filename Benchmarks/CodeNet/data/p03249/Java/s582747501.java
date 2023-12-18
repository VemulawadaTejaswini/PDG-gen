import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int n=in.nextInt();
		Pair[] d = new Pair[n];
		int[] s = new int[n], p = new int[n];
		Map<Long, Integer> mp = new HashMap<Long, Integer>();
		for(int i=0; i<n; ++i) {
			d[i] = new Pair(in.nextLong(), i);
			mp.put(d[i].a, i);
			s[i]=1;
		}
		Arrays.sort(d);
		for(int i=0; i<n-1; ++i) {
			int u=d[i].b;
			p[u]=mp.getOrDefault(d[i].a-n+2*s[u], -1);
			if(d[i].a-n+2*s[u]>=d[i].a||p[u]==-1) {
				System.out.println(-1);
				return;
			}
			s[p[u]]+=s[u];
		}
		for(int i=0; i<n-1; ++i)
			out.println((d[i].b+1)+" "+(p[d[i].b]+1));
		out.close();
	}
	
	static class Pair implements Comparable<Pair> {
		long a;
		int b;
		Pair(long a, int b) {
			this.a=a;
			this.b=b;
		}
		public int compareTo(Pair o) {
			return -Long.compare(a, o.a);
		}
	}
	
	static class Reader {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(Exception e) {}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}