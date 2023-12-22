import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static ArrayList<ArrayList<Integer>> adj;
	public static int[] visited;
	public static int dfs(int parent,int vertex) {
		visited[vertex] = 1;
		int cnt = 0;
		boolean flag = true;
		for(int i=0;i<adj.get(vertex).size();i++) {
			if(adj.get(vertex).get(i)==parent) continue;
//			flag = false;
			if(visited[adj.get(vertex).get(i)]==0) {
				flag = false;
				cnt+=dfs(vertex,adj.get(vertex).get(i));
			}
		}
		return cnt+1;
	}
	public static void main(String[] args) {
		FastReader in = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt(), m = in.nextInt();
		adj = new ArrayList<>();
		visited = new int[n];
		for(int i=0;i<n;i++) adj.add(new ArrayList<>());
		for(int i=0;i<m;i++) {
			int u = in.nextInt()-1,v = in.nextInt()-1;
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		long ans = 0;
		for(int i=0;i<n;i++) {
			if(visited[i]==0) ans = Math.max(ans, dfs(-1,i));
		}
		out.println(ans);
		out.close();
	}

	static final Random random=new Random();
	//	static void ruffleSort(Pair[] a) {
	//		int n=a.length;//shuffle, then sort 
	//		for (int i=0; i<n; i++) {
	//			int oi=random.nextInt(n);
	//			Pair temp=a[oi];
	//			a[oi]=a[i]; a[i]=temp;
	//		}
	//		Arrays.sort(a);
	//	}
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	static void ruffleSort(char[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n);
			char temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException  e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 

		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
	}
}

//class Pair implements Comparable<Pair>{
//    int a;
//    int b;
//    public Pair(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//    public int compareTo(Pair o) {
//        if(this.a==o.a)
//            return this.b - o.b;
//        return this.a - o.a;
//    }   
//}