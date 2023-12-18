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
    private static int fact(int n) { int ans=1; for(int i=2;i<=n;i++) ans*=i; return ans; }
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
    static double ans = 0.0;
    static int x[],y[],p[];
    private static void solve(FastScanner in, PrintWriter out){
        int n = in.nextInt();
        x = new int[n];
        y = new int[n];
        p = new int[n];
        for(int i=0;i<n;i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            p[i] = i;
        }
        perm(0,n);
        // ans/=(fact(n)+0.0);
        // ans = ((double)ans/(double)fact(n));
        out.println(ans);
    }
    public static void perm(int pt,int n){
        if(pt==n){
            double dist = 0.0;//Math.sqrt((x[p[0]]*x[p[0]])+(y[p[0]]*y[p[0]]));
            // System.out.println("dsit1;: "+dist);
            for(int i=1;i<n;i++){
                int dx = (x[p[i]] - x[p[i-1]])*(x[p[i]]-x[p[i-1]]);
                int dy = (y[p[i]]-y[p[i-1]])*(y[p[i]]-y[p[i-1]]);
                dist += Math.sqrt(dx+dy);
            }
            ans += dist/(fact(n)+.0);
            // System.out.println("dsit: "+dist);
        }else{
            for(int j=pt;j<n;j++){
                swap(pt,j);
                perm(pt+1,n);
                swap(pt,j);
            }
        }
    }
    public static void swap(int i,int j){
        int tmp = p[i];
        p[i] = p[j];
        p[j] = tmp;
    }
    /************* SOLUTION ENDS HERE **********/
}