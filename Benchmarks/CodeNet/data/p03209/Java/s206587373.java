import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	 static long ans=0; 
	static long [] a=new long[52];
	static long [] b=new long[52];
    static void dfs(long p,int n)
     {
    //System.out.println(p+" "+n);
    //System.out.println(a[n-1]+" "+b[n-1]);
    	if(n==1) 
    	{
    		if(p==2)
    		{
    			ans+=1;
    		}
    		else if(p==3)
    		{
    			ans+=2;
    		}
    		else if(p==4)
    		{
    			ans+=3;
    		}
    	}
    	else
    	{
    		if(p==a[n-1]+2)
    		{
    			ans=ans+1+b[n-1];
    			return ;
    		}
    		else if(p==a[n])
    		{
    			ans=ans+b[n];
    			return;
    		}
    		else if(p==1)
    		{
    			return;
    		}
    		else if(p>a[n-1]+2)
    		{
    			ans=ans+b[n-1]+1;
    			dfs(p-a[n-1]-2,n-1);
    		}
    		else 
    		{
    			dfs(p-1,n-1);
    		}
    	}
    	return ;
     }
	public static void main(String args[])throws IOException  {

	
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		
		int n=in.nextInt();
	    a[1]=5;
		b[1]=3;
		for(int i=2;i<=50;i++)
		{
			a[i]=2*a[i-1]+3;
			b[i]=2*b[i-1]+1;
		}
		long m=in.nextLong();
         
		
		dfs(m,n);
		out.println(ans);
		
		out.close();
//		while(in.hasNext())
//		{
//			
//			
//		}
//
//			
//		}
//		
	}
	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;
 
		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}
 
		public int nextInt() {
			return Integer.parseInt(nextString());
		}
 
		public long nextLong() {
			return Long.parseLong(nextString());
		}
 
		public double nextDouble() {
			return Double.parseDouble(nextString());
		}
 
		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}
 
		public int[] nextIntArrayDec(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt() - 1;
			}
			return res;
		}
 
		public int[] nextIntArray1Index(int n) {
			int[] res = new int[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextInt();
			}
			return res;
		}
 
		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}
 
		public long[] nextLongArrayDec(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong() - 1;
			}
			return res;
		}
 
		public long[] nextLongArray1Index(int n) {
			long[] res = new long[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextLong();
			}
			return res;
		}
 
		public double[] nextDoubleArray(int n) {
			double[] res = new double[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextDouble();
			}
			return res;
		}
 
		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}
 
	
}
