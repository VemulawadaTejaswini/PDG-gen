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
    private static int fact(int n){
        int ans=1;
        for(int i=2;i<=n;i++) ans*=i;
        return ans;
    }
    private static void solve(FastScanner in, PrintWriter out){
        int n = in.nextInt();
        int P[] = new int[n];
        int Q[] = new int[n];
        for(int i=0;i<n;i++) P[i] = in.nextInt();
        for(int i=0;i<n;i++) Q[i] = in.nextInt();
        int ans1 = findKthPermutation(P,n);
        int ans2 = findKthPermutation(Q,n);
        out.println(Math.abs(ans1-ans2));
    }
    private static int findKthPermutation(int a[],int n){
        boolean vis[] = new boolean[n+1];
        int sum = 0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=1;j<a[i];j++){
                if(!vis[j])
                    cnt++;
            }
            sum += cnt*fact(n-i-1);
            vis[a[i]]=true;
        }
        return sum;
    }
    /************* SOLUTION ENDS HERE **********/
} 