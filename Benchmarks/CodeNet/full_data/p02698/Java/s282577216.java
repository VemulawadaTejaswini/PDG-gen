import java.io.*;
import java.util.*;

public class Main{
	
		
	static int N; 			//the number of elements in the array as a power of 2 (i.e. after padding)
	static int[] sTree;
	
	static void update_point(int index, int val)			// O(log n)
	{
		index += N - 1;				
		sTree[index] = val;			
		while(index>1)				
		{
			index >>= 1;
			sTree[index] = Math.max(sTree[index<<1] , sTree[index<<1|1]);		
		}
	}
	
	
	
	static int query(int i, int j)
	{
		return query(1,1,N,i,j);
	}
	
	static int query(int node, int b, int e, int i, int j)	// O(log n)
	{
		if(i>e || j <b)
			return 0;		
		if(b>= i && e <= j)
			return sTree[node];
		int mid = b + e >> 1;
		int q1 = query(node<<1,b,mid,i,j);
		int q2 = query(node<<1|1,mid+1,e,i,j);
		return Math.max(q1 , q2);	
				
	}
	
	static int query_point(int i)
	{
		//only when no lazy propagation
		return sTree[i+N-1];
	}
		
	
	static HashMap<Integer, Integer>map;
	static int[]in;
	static int[]ans;
	static void dfs(int i,int par) {
		int val=map.get(in[i])+1;
		int before=query_point(val);
		
		int left=1,right=val-1;
		int maxSeq;
		if(right<left) {
			maxSeq=0;
		}
		else {
			maxSeq=query(left, right);
		}
		
		ans[i]=Math.max(maxSeq+1, par==-1?0:ans[par]);
		
		//put the best sequence ending at i for subtree of i
		update_point(val, maxSeq+1);
		
		for(int j:adj[i]) {
			if(j==par)continue;
			dfs(j, i);
		}
		

		//remove the best sequence ending at i for all nodes other than subtree of i
		update_point(val, before);
	}
	static LinkedList<Integer>[]adj;
	public static void main(String[] args) throws Exception{
		PrintWriter pw=new PrintWriter(System.out);
		MScanner sc = new MScanner(System.in);
		int n=sc.nextInt();
		in=sc.intArr(n);
		
		int[]tmp=in.clone();
		shuffle(tmp);
		Arrays.sort(tmp);
		map=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(tmp[i]))continue;
			map.put(tmp[i], map.size());
		}
		N = 1; 
		while(N < map.size()) N <<= 1; //padding
		sTree = new int[N<<1];		//no. of nodes = 2*N - 1, we add one to cross out index zero
		
		ans=new int[n];
		adj=new LinkedList[n];
		for(int i=0;i<n;i++)adj[i]=new LinkedList<>();
		
		for(int i=0;i<n-1;i++) {
			int x=sc.nextInt()-1,y=sc.nextInt()-1;
			adj[x].add(y);
			adj[y].add(x);
			
		}
		dfs(0, -1);
		for(int i:ans)pw.println(i);
		pw.flush();
	}
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] intArr(int n) throws IOException {
	        int[]inArr=new int[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        return inArr;
		}
		public long[] longArr(int n) throws IOException {
	        long[]inArr=new long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        return inArr;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]inArr=new int[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        shuffle(inArr);
	        Arrays.sort(inArr);
	        return inArr;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]inArr=new long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        shuffle(inArr);
	        Arrays.sort(inArr);
	        return inArr;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]inArr=new Integer[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        return inArr;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]inArr=new Long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        return inArr;
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=(int)(Math.random()*inArr.length);
			int tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
	static void shuffle(long[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=(int)(Math.random()*inArr.length);
			long tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
}
