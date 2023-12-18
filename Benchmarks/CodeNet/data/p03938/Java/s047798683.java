import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] p =new int[n];
		
		int[] rev=new int[n];
		for(int i=0; i<n;i++) rev[sc.nextInt()-1]=i;
		for(int i=0; i<n; i++) {
			a[i]=30000*(i+1);
			b[i]=30000*(n-i)+rev[i];
		}
		printArray(a);
		printArray(b);
 	}
	
	static void printArray(int[] a) {
		int n=a.length;
		for(int i=0; i<n; i++) {
			if(i==0) System.out.print(a[i]);
			else System.out.print(" "+a[i]);
		}
		System.out.println();
	}

	static class MyScanner
	{
		BufferedReader br;
		StringTokenizer st;
		public MyScanner(InputStream s) 
		{
			br=new BufferedReader(new InputStreamReader(s));
		}
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next() throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException
		{
			return Integer.parseInt(next());
			
		}
		public double nextDouble() throws IOException
		{
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException
		{
			return br.ready();
		}
		public long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
