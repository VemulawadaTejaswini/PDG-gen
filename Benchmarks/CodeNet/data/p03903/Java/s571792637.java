import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*; 
 

class Main{ 
	static class Edge{
		int from, to;
		long cost;
		Edge(int f, int t, long c){from=f;to=t;cost=c;}
	}
	static class UF{
		int pare[];
		UF(int n){
			pare=new int[n];
			Arrays.fill(pare, -1);
		}
		int root(int v){
			if(pare[v]<0)return v;
			return pare[v]=root(pare[v]);
		}
		boolean unite(int u, int v){
			u=root(u);v=root(v);
			if(u==v)return false;
			if(pare[u]<pare[v]){
				int tmp=u;u=v;v=tmp;
			}
			pare[v]+=pare[u];
			pare[u]=v;
			return true;
		}
	}
	static List<Edge> edges[];
	static int[][] max;
	static void dfs(int s, int v, int maxdis){
		max[s][v]=maxdis;
		for(Edge e: edges[v])if(e.to!=s && max[s][e.to]==0)dfs(s, e.to, Math.max(maxdis, (int)e.cost));
	}

	static void solve(){

		int n = ni(), m=ni();
		PriorityQueue<Edge> que = new PriorityQueue<>((a,b)->a.cost-b.cost<0 ? -1:1);
		for(int i=0;i<m;++i){
			int a=ni()-1, b=ni()-1;
			long c = nl();
			que.add(new Edge(a,b,c));
		}
		edges = new List[n];
		for(int i=0;i<n;++i)edges[i]=new ArrayList<>();
		UF uf = new UF(n);
		long sum = 0;
		while(!que.isEmpty()){
			Edge e = que.poll();
			if(uf.unite(e.from, e.to)){
				sum+=e.cost;
				edges[e.from].add(e);
				edges[e.to].add(new Edge(e.to, e.from, e.cost));
			}
		}
		int q = ni();
		max = new int[n][n];
		for(int i=0;i<n;++i)dfs(i, i, 0);
		while(q-->0){
			int s = ni()-1, t=ni()-1;
			out.println(sum-max[s][t]);
		}


 
	} 
 
 
 
 
	 public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
	 static boolean inrange(int y, int x, int h, int w){ 
		 return y>=0 && y<h && x>=0 && x<w; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static<T extends Comparable> int lower_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
		 while(upper - lower>1){ 
		 int center =(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>=0)upper=center; 
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> int upper_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
		 while(upper-lower >1){ 
		 int center=(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>0)upper=center; 
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> boolean next_permutation(List<T> list){ 
		 int lastIndex = list.size()-2; 
		 while(lastIndex>=0 && list.get(lastIndex).compareTo(list.get(lastIndex+1))>=0)--lastIndex; 
		 if(lastIndex<0)return false; 
		 int swapIndex = list.size()-1; 
		 while(list.get(lastIndex).compareTo(list.get(swapIndex))>=0)swapIndex--; 
		 T tmp = list.get(lastIndex); 
		 list.set(lastIndex++, list.get(swapIndex)); 
		 list.set(swapIndex, tmp); 
		 swapIndex = list.size()-1; 
		 while(lastIndex<swapIndex){ 
		 tmp = list.get(lastIndex); 
		 list.set(lastIndex, list.get(swapIndex)); 
		 list.set(swapIndex, tmp); 
		 ++lastIndex;--swapIndex; 
		 } 
		 return true; 
	 } 
	 private static final byte[] buffer = new byte[1<<15]; 
	 private static int ptr = 0; 
	 private static int buflen = 0; 
	 private static boolean hasNextByte(){ 
		 if(ptr<buflen)return true; 
		 ptr = 0; 
		 try{ 
			 buflen = in.read(buffer); 
		 } catch (IOException e){ 
			 e.printStackTrace(); 
		 } 
		 return buflen>0; 
	 } 
	 private static int readByte(){ if(hasNextByte()) return buffer[ptr++]; else return -1;} 
	 private static boolean isSpaceChar(int c){ return !(33<=c && c<=126);} 
	 private static int skip(){int res; while((res=readByte())!=-1 && isSpaceChar(res)); return res;} 
 
	 private static double nd(){ return Double.parseDouble(ns()); } 
	 private static char nc(){ return (char)skip(); } 
	 private static String ns(){ 
		 StringBuilder sb = new StringBuilder(); 
		 for(int b=skip();!isSpaceChar(b);b=readByte())sb.append((char)b); 
		 return sb.toString(); 
	 } 
	 private static int[] nia(int n){ 
		 int[] res = new int[n]; 
		 for(int i=0;i<n;++i)res[i]=ni(); 
		 return res; 
	 } 
	 private static long[] nla(int n){ 
		 long[] res = new long[n]; 
		 for(int i=0;i<n;++i)res[i]=nl(); 
		 return res; 
	 } 
	 private static int ni(){ 
		 int res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 && !((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus ? -res:res; 
	 } 
	 private static long nl(){ 
		 long res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 && !((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus ? -res:res; 
	} 
} 

