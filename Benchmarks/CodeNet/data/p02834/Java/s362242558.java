import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String []args) throws IOException {
    	FastScanner in  = new FastScanner(System.in);
    	PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false); 
    	solve(in, out);
    	in.close();
    	out.close();
    }
    static long gcd(long a, long b){ return (b==0) ? a : gcd(b, a%b); }
    static int gcd(int a, int b){ return (b==0) ? a : gcd(b, a%b); }
    static class FastScanner{
	BufferedReader reader;
	StringTokenizer st;
	FastScanner(InputStream stream){reader=new BufferedReader(new InputStreamReader(stream));st=null;}	
	String next(){while(st == null || !st.hasMoreTokens()){try{String line = reader.readLine();if(line == null){return null;}		    
	     st = new StringTokenizer(line);}catch (Exception e){throw new RuntimeException();}}return st.nextToken();}
	String nextLine()  {String s=null;try{s=reader.readLine();}catch(IOException e){e.printStackTrace();}return s;}	    	  	
	int    nextInt()   {return Integer.parseInt(next());}
	long   nextLong()  {return Long.parseLong(next());}		
	double nextDouble(){return Double.parseDouble(next());}
	char   nextChar()  {return next().charAt(0);}
	int[]  nextIntArray(int n)         {int[] arr= new int[n];   int i=0;while(i<n){arr[i++]=nextInt();}  return arr;}
	long[] nextLongArray(int n)        {long[]arr= new long[n];  int i=0;while(i<n){arr[i++]=nextLong();} return arr;}	
	int[]  nextIntArrayOneBased(int n) {int[] arr= new int[n+1]; int i=1;while(i<=n){arr[i++]=nextInt();} return arr;}	    	
	long[] nextLongArrayOneBased(int n){long[]arr= new long[n+1];int i=1;while(i<=n){arr[i++]=nextLong();}return arr;}	    	
	void   close(){try{reader.close();}catch(IOException e){e.printStackTrace();}}				
    }
    
    /********* SOLUTION STARTS HERE ************/
    static ArrayList<Integer> ar[];
    static int n;
    static int dep1[],dep2[];
    static boolean vis[];
    private static void solve(FastScanner in, PrintWriter out){
        n = in.nextInt();
        int tak = in.nextInt()-1;
        int aok = in.nextInt()-1;
        int u,v;
        ar = new ArrayList[n];
        dep1 = new int[n];
        dep2 = new int[n];
        vis = new boolean[n];
        for(int i=0;i<n;i++) ar[i] = new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            u = in.nextInt()-1;
            v = in.nextInt()-1;
            ar[u].add(v);
            ar[v].add(u);
        }
        dfs1(tak,0);
        Arrays.fill(vis,false);
        dfs2(aok,0);
        int ans = 0;
        for(int i=0;i<n;i++){
            if(dep1[i]<dep2[i]){
                ans = Math.max(ans,dep2[i]);
            }
        }
        out.println(ans-1);
    }
    static void dfs1(int s,int d){
        dep1[s] = d;
        vis[s] = true;
        for(int i:ar[s]){
            if(!vis[i]) dfs1(i,d+1);
        }
    }
    static void dfs2(int s,int d){
        dep2[s] = d;
        vis[s] = true;
        for(int i:ar[s]){
            if(!vis[i]) dfs2(i,d+1);
        }
    }
    /************* SOLUTION ENDS HERE **********/
}