import java.io.*;
import java.util.*;

public class Main {
	static PrintWriter out=new PrintWriter(System.out);
	static int memo[][];
	static char x[][];
	static int H,W;
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		H=sc.nextInt();
		W=sc.nextInt();
		x=new char[H][];
		memo=new int[H][W];
		for (int i=0;i<H;i++) {
			x[i]=sc.next().toCharArray();
		}
		for (int x[]:memo) {
			Arrays.fill(x, -1);
		}
		out.println(dp(0,0)%mod);

		out.flush();

	}
	static final int mod = (int) (1e9+7);
	static int dp(int i,int j) {
		if (i==H||j==W) {

			return 0;
		}

		if (i==H-2&&j==W-1) {

			if (x[i][j]=='.')return 1;
			else return 0;
		}
		if (i==H-1&&j==W-2) {

			if (x[i][j]=='.')return 1;
			else return 0;
		}
		long count=0;
		if (j+1<W)
			if (x[i][j+1]=='.') {

				if (memo[i][j+1]!=-1) {
					count+=memo[i][j+1];
				}
				else {
					count+=memo[i][j+1]=dp(i,j+1);
				}

			}
		if (i+1<H)
			if (x[i+1][j]=='.') {
				if (memo[i+1][j]!=-1) {
					count+=memo[i][j+1];
				}
				else {
					count+=memo[i+1][j]=dp(i+1,j);
				}
			}
		return (int) (count%mod);


	}

	static class O implements Comparable <O>{
		int from ;
		int to;
		O(int f,int t){
			from=f;
			to=t;
		}
		@Override
		public int compareTo(O o) {
			return this.from-o.from;
		}





	}

	static boolean func(long x,long s) {
		long k=0;
		long xi=x;
		while(x>0) {
			k+=x%10;
			x/=10;
		}
		return xi-k>=s;

	}
	static boolean isSorted(int a[]) {
		for (int i=0;i<a.length-1;i++) {
			if (a[i]>a[i+1]) return false;
		}
		return true;
	}
	static ArrayList<Integer> adjList[];
	static int visited[];
	static void bfs(int s)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		visited[s] =1;
		int i=1;
		while(!q.isEmpty())
		{
			int u = q.remove();

			for(int v: adjList[u])
				if(visited[v]==0)
				{
					visited[v] = visited[u]+i;
					q.add(v);
				}
			i++;
		}
	}




	static class UnionFind {                                              
		int[] p, rank, setSize;
		int numSets;

		public UnionFind(int N) 
		{
			p = new int[numSets = N];
			rank = new int[N];
			setSize = new int[N];
			for (int i = 0; i < N; i++) {  p[i] = i; setSize[i] = 1; }
		}

		public int findSet(int i) { return p[i] == i ? i : (p[i] = findSet(p[i])); }

		public boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }

		public void unionSet(int i, int j) 
		{ 
			if (isSameSet(i, j)) 
				return;
			numSets--; 
			int x = findSet(i), y = findSet(j);
			if(rank[x] > rank[y]) { p[y] = x; setSize[x] += setSize[y]; }
			else
			{	p[x] = y; setSize[y] += setSize[x];
			if(rank[x] == rank[y]) rank[y]++; 
			} 
		}

		public int numDisjointSets() { return numSets; }

		public int sizeOfSet(int i) { return setSize[findSet(i)]; }
	}

	static class Scanner{
		StringTokenizer st;
		BufferedReader br;
		public Scanner(InputStream system) { br = new BufferedReader(new InputStreamReader(system));}
		public Scanner(String file) throws Exception{br = new BufferedReader(new FileReader (file));}
		public String next() throws IOException{
			while (st==null|| !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException{
			return Long.parseLong(next());
		}
		public String nextLine() throws IOException{
			return br.readLine();
		}
		public Double nextDouble() throws IOException{
			return Double.parseDouble(next());
		}

	}
}