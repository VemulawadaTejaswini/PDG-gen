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
    
    private static void solve(FastScanner in, PrintWriter out){
        int mod = (int)(1e9+7);
        int n = in.nextInt();
        int mat1[][] = new int[n][60];
        int mat2[][] = new int[n][60];
        
        int ans[] = new int[61];
        // long a[] = new long[n];
        // for(int i=0;i<n;i++){
        //     a[i] = in.nextLong();
        // }
        long tmp = 0L;
        for(int i=0;i<n;i++){
            tmp = in.nextLong();
            for(int j=0;j<60;j++){
                if(((1L<<j)&tmp)!=0) {mat1[i][j]=1;mat2[i][j]=1;}
            }
        }
        
        
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<60;j++){
        //         out.write(mat1[i][j]+" ");
        //     }
        //     out.write("\n");
        // }
        
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<60;j++){
                mat2[i][j] += mat2[i+1][j];
            }
        }
        // out.write("\n\n");
        
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<60;j++){
        //         out.write(mat2[i][j]+" ");
        //     }
        //     out.write("\n");
        // }
        
        // out.write("\n\n");out.write("\n\n");
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<60;j++){
                if(mat1[i][j]==0){
                    ans[j] += mat2[i+1][j];
                } else {
                    ans[j] += (n-i-1-mat2[i+1][j]);
                }
            }
        }
        
        
        
        // for(int i=0;i<61;i++) out.write(ans[i]+" ");out.write("\n");
        long pp = 0L;
        for(int i=0;i<61;i++){
            pp += (ans[i]*((1L<<i)%mod))%mod;
            pp%=mod;
        }
        out.write(pp+"\n");
        
        
        // long sum = 0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         sum += (a[i]^a[j])%mod;
        //         sum%=mod;
        //     }
        // }
        // out.write(sum+"\n");
    }
    
    /************* SOLUTION ENDS HERE **********/
}