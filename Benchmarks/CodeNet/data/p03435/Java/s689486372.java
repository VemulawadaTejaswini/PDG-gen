import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int[][] c = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) c[i][j] = sc.nextInt();
		}
		for(int a0=-300; a0<=300; a0++) {
			for(int a1=-300; a1<=300; a1++) {
				for(int a2=-300; a2<=300; a2++) {
					if(c[0][0]-a0==c[1][0]-a1&&c[1][0]-a1==c[2][0]-a2) {
						if(c[0][1]-a0==c[1][1]-a1&&c[1][1]-a1==c[2][1]-a2) {
							if(c[0][2]-a0==c[1][2]-a1&&c[1][2]-a1==c[2][2]-a2) {
								System.out.println("Yes");
								return;
							}
						}
					}
				}
			}
		}
		System.out.println("No");
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
