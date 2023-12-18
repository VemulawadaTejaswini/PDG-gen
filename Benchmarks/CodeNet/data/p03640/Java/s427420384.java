import java.io.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.*;

class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static int[] a;
	static int[][] arr;
	
	static void go(int l1,int r1,int l2,int r2,int idx)
	{
		if(l1>l2 || r1>r2)
		{
			return;
		}
		
		if(l1==l2)
		{
			for(int i=r1;i<=r2;i++)
			{
				arr[l1][i]=a[idx++];
			}
		}
		else if(r1==r2)
		{
			for(int i=l1;i<=l2;i++)
			{
				arr[i][r1]=a[idx++];
			}
		}
		
		else
		{
			for(int i=l1;i<=l2;i++)
			{
				arr[i][r1]=a[idx++];
			}
			
			for(int i=r1+1;i<=r2;i++)
			{
				arr[l2][i]=a[idx++];
			}
			
			for(int i=l2-1;i>=l1;i--)
			{
				arr[i][r2]=a[idx++];
			}
			
			for(int i=r2-1;i>r1;i--)
			{
				arr[l1][i]=a[idx++];
			}
		}
		
		go(l1+1,r1+1,l2-1,r2-1,idx);
	}
	
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt(),ptr=0;a=new int[n*m];
		
		for(int i=0;i<k;i++)
		{
			int x=sc.nextInt();
			
			for(int j=0;j<x;j++)
			{
				a[ptr++]=i+1;
			}
		}
		
		arr=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=-1;
			}
		}
		
		go(0,0,n-1,m-1,0);
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				out.print(arr[i][j]+" ");
			}
			
			out.println("");
		}
		
		out.close();
    }
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;

    public FastScanner(BufferedReader in) {
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}