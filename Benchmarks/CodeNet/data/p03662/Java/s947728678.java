import java.util.*;
import java.math.*;
import java.io.*;
import java.text.*;

public class Main{
static class Node implements Comparable<Node>{
	int id;
	long d;
	public Node(int id,long d) {
		this.id=id;
		this.d=d;
	}
	public int compareTo(Node c) {
		return Long.compare(this.d, c.d);
	}
}
//public static PrintWriter pw; 	
public static PrintWriter pw=new PrintWriter(System.out);
public static void solve() throws IOException{
//	pw=new PrintWriter(new FileWriter("C:\\Users\\shree\\Downloads\\small_output_in"));
	FastReader sc=new FastReader();
	int n=sc.I();
	graph=new Vector[n+1];
	for(int i=1;i<=n;i++)graph[i]=new Vector<>();
	for(int i=1;i<n;i++) {
		int x=sc.I(); int y=sc.I(); 
		graph[x].add(y);
		graph[y].add(x);
		
	}
	a=new int[n+1];
	b=new int[n+1];
	cnt1=new int[n+1];
	cnt2=new int [n+1];
	dfs(1,-1,n,a);
	dfs(n,-1,1,b);
	dfs2(1,-1,cnt1);
	dfs2(n,-1,cnt2);
	int c1=0,c2=0;
	for(int u : graph[1]) {
		if(a[u]!=1) c1=Math.max(c1, cnt1[u]);
	}
	for(int u : graph[n]) {
		if(b[u]!=1) c2=Math.max(c2, cnt2[u]);
	}
	if(c1>c2) pw.println("Fennec"); else pw.println("Snuke");
	pw.close(); 
	
	
}
static Vector<Integer> graph[];
static int a[];
static int b[];
static int cnt1[];
static int cnt2[];
static boolean dfs(int v,int pr ,int d,int a[]) {
	if(v==d) { 
		a[v]=1;
		return true;
	
	}
	for(int u: graph[v]) {
		if(u != pr) {
			if(dfs(u,v,d,a)) a[v]=1;
		}
	}
	return false;
}
static int dfs2(int v,int pr,int cnt[]) {
	int c=0;
	for(int u: graph[v]) {
		if(u!=pr) {
			c=Math.max(c, dfs2(u,v,cnt));
			
		}
	}
	cnt[v]=c+1;
	return c+1;
}
public static void main(String[] args)  {
    new Thread(null ,new Runnable(){
      public void run(){
          try{
          
              solve();
          } catch(Exception e){
              e.printStackTrace();
          }
      }
  },"1",1<<26).start();
 
}

static long M=(long)Math.pow(10,9)+7;
 
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() throws FileNotFoundException{
            //br=new BufferedReader(new FileReader("C:\\Users\\shree\\Downloads\\B-small-practice.in"));	
        	 br = new BufferedReader(new InputStreamReader(System.in));
        		
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
       
        int I(){   return Integer.parseInt(next()); }
        long L(){  return Long.parseLong(next()); }
        double D() {  return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
     }
}