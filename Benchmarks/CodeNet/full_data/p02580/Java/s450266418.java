import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt() , x = in.nextInt();
        int r[] = new int[n+1];
        int c[] = new int[m+1];
        long maxr = 0, maxc = 0;int mr = 0, mc = 0;
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int i=0;i<x;i++) {
        	int a = in.nextInt(), b = in.nextInt();
        	if(map.containsKey(a))
        		map.get(a).add(b);
        	else
        	{
        		HashSet<Integer> set = new HashSet<>();
        		set.add(b);
        		map.put(a, set);
        	}
        	r[a]++;c[b]++;
        	maxr = Math.max(maxr, r[a]);
        	maxc = Math.max(maxc, c[b]);
        }
        long pans = maxr + maxc;
        long maxAns = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++) {
        	if(r[i]==maxr) {
        		for(int j=1;j<=m;j++) {
            		long ans = r[i]+c[j];
            		if(ans==pans) {
            			if(map.containsKey(i)) {
            	        	if(map.get(i).contains(j)) {
            	        		ans = ans-1;
            	        	}
            			}
            			maxAns = Math.max(maxAns, ans);
            		}
            	}
        	}
        }
        out.println(maxAns);
        out.flush();
	}
	
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		String next() {
			while(!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				}catch(IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] readArray(int n) {
			int a[] = new int[n];
			for(int i=0;i<n;i++) a[i] = nextInt();
			return a;
		}
		
		long[] readArray(int n,long x) {
			long a[] = new long[n];
			for(int i=0;i<n;i++) a[i] = nextLong();
			return a;
		}
		
	}
}









