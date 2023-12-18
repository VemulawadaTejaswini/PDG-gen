

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {static class FastReader 
    { 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader() 
    { 
        br = new BufferedReader(new
                 InputStreamReader(System.in)); 
    } 

    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 

    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 

    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 

    double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 

    String nextLine() 
    { 
        String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str; 
    } 
} 
	static ArrayList<Integer>[] adj;
	static long lazy[];
	public static void dfs(int u,long prev) {
		lazy[u]+=prev;
		for(int to:adj[u])
		{
			dfs(to,lazy[u]);
		}
		
	}
	public static void main(String args[])
	{
//		Scanner scan=new Scanner(System.in);
		FastReader scan=new FastReader();
		int n=scan.nextInt();
		int q=scan.nextInt();
		adj=new ArrayList[n];
		for(int i=0;i<n;i++)
		{
			adj[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<n-1;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			u--;
			v--;
			adj[u].add(v);
			
		}
		lazy=new long[n];
		int org[]=new int[n];
		for(int i=0;i<q;i++)
		{
			int x=scan.nextInt();
			int node=scan.nextInt();
			lazy[x-1]+=node;
			
		}
		dfs(0,0);
		for(int i=0;i<n;i++)
		{
			System.out.print(lazy[i]+" ");
		}
	}
}
