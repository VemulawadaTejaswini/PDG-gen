import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 

class Main{

	static class Edge{
		int to;
		long cost;
		Edge(int t, long c){to=t;cost=c;}
	}

	static List<Edge>[] edges;

	static int[] color;
	static boolean paint(int v, int c){
		color[v]=c;
		boolean res=true;
		for(Edge e: edges[v]){
			if(color[e.to]<0)res&=paint(e.to, (c+1)%2);
			if(color[e.to]==c)res=false;
		}
		return res;
	}
	static long[] pot;
	static void dfs(int v, long c){
		pot[v]=c;
		for(Edge e: edges[v]){
			if(pot[e.to]==Integer.MIN_VALUE)dfs(e.to, e.cost-c);
		}
	}
	static int dfs2(int v, long c){
		pot[v]=c;
		int res = -1;
		for(Edge e: edges[v]){
			if(pot[e.to]==Integer.MIN_VALUE)res=Math.max(res, dfs2(e.to, e.cost-c));
			else{
				if(pot[v]+pot[e.to]!=e.cost){
					res=e.to;
					pot[e.to]=(pot[e.to]+(e.cost-c)%2==0 ? (pot[e.to]+(e.cost-c))/2 : -2);
				}
			}
		}
		return res;
	}

	static void solve(){ 
		int n=ni(), m=ni();
		color = new int[n];
		edges = new List[n];
		pot = new long[n];
		for(int i=0;i<n;++i)edges[i]=new ArrayList<>();
		Arrays.fill(color, Integer.MIN_VALUE);
		Arrays.fill(pot, Integer.MIN_VALUE);

		while(m-->0){
			int u=ni()-1, v=ni()-1, s=ni();
			edges[u].add(new Edge(v, (long)s));
			edges[v].add(new Edge(u, (long)s));
		}
		if(paint(0, 0)){
			dfs(0, 1);
			long bmin = Long.MAX_VALUE;
			long wmin = Long.MAX_VALUE;
			for(int i=0;i<n;++i){
				if(color[i]==0)bmin=Math.min(bmin, pot[i]);
				else wmin=Math.min(wmin, pot[i]);
			}
			wmin -= (1-bmin);
			out.println(Math.max(0,wmin));
		}else{
			int root = dfs2(0, 1);
			if(root==-1)out.println(1);
			else{
				long p = pot[root];
				Arrays.fill(pot, Integer.MIN_VALUE);
				dfs(root, p);
				for(int i=0;i<n;++i)if(pot[i]<=0){
					out.println(0);return;
				}
				out.println(1);
			}
		}

	} 
 
 
 
 
	public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
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

