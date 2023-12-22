import java.io.*;
import java.util.*;

public class Main {
	
	static int cnt;
	static int vis[];
	static HashMap<Integer,ArrayList<Integer>> gph;
	
	static void dfs(int a) {
		vis[a]=1;
		cnt++;
		for(int x : gph.get(a)) {
			if(vis[x]!=1) {
				dfs(x);
			}
		}
	}

	public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt() , m = in.nextInt();
        gph = new HashMap<>();
        HashSet<Long> set = new HashSet<>();
        for(int i=0;i<m;i++) {
        	int a,b;
        	a = in.nextInt(); b = in.nextInt();
        	if(!set.contains(hashInt(a,b))) {
        		set.add(hashInt(a,b));set.add(hashInt(b,a));
        		if(gph.containsKey(a)) gph.get(a).add(b);
        		else {
        			ArrayList<Integer> ar = new ArrayList<>(); ar.add(b);
        			gph.put(a, ar);
        		}
        		if(gph.containsKey(b)) gph.get(b).add(a);
        		else {
        			ArrayList<Integer> ar = new ArrayList<>(); ar.add(a);
        			gph.put(b, ar);
        		}
        	}
        }

    	vis = new int[n+1];
        int ans = 0;
        for(int i=1;i<=n;i++) {
        	if(vis[i]!=1&&gph.containsKey(i)) {
        		cnt=0;
        		dfs(i);
        		ans = Math.max(ans, cnt);
        	}
        }
        out.println((m==0)?"1":ans);
        
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
	
	static boolean arrayEquals(char a[], char b[]) {
		int n = a.length;
		boolean verdict = true;
		for(int i=0;i<n;i++) {
			if(a[i]!=b[i]) {
				verdict = false;break;
			}
		}
		return verdict;
	}
	
	static long lcm(long a, long b) {
		return (a*b)/gcd(a,b);
	}
	
	static long gcd(long a, long b) {
		if(b==0) return a;
		else return gcd(b,a%b);
	}
	
	static long hashInt(int x,int y) {
		return x*(1_000_000_000L)+y;
	}
}








