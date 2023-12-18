///package CodeChef;

import java.util.*;
import java.io.*;
public class Main {
	public static boolean[] b;
	static int[] FF;
	static int[] A;
	public static void main(String[] ard)  throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		int n=Integer.valueOf(br.readLine().trim());
		  LinkedList[] L=new LinkedList[n+1];
		  for(int i=1;i<=n;i++)L[i]=new LinkedList<Edge>();
		  for(int i=1;i<=n-1;i++)
		  {
			  String[] s1=br.readLine().trim().split("\\s++");
			  int u=Integer.valueOf(s1[0]);
			  int v=Integer.valueOf(s1[1]);
			  int w=Integer.valueOf(s1[2]);
			  L[u].add(new Edge(v,w));
			  L[v].add(new Edge(u,w));  
		  }
		  int[] dist=new int[n+1];
		  Arrays.fill(dist, Integer.MAX_VALUE);
		  String[] s2=br.readLine().trim().split("\\s++");
		  int q=Integer.valueOf(s2[0]);
		  int k=Integer.valueOf(s2[1]);
		  dist[k]=0;
		  Queue<Integer> Q=new LinkedList<Integer>();
				  Q.offer(k);
				 while(!Q.isEmpty()) 
				 {
					 int u=Q.poll();
					  for(Object o: L[u])
					  {
						  Edge e=(Edge)o;
						  if(dist[e.v]==Integer.MAX_VALUE)
						  {
							  Q.offer(e.v);
							  dist[e.v]=Math.min(dist[e.v],dist[u]+e.w);
						  }
					  }
					 
				 }
		for(int i=1;i<=q;i++)
		{
			String[] s3=br.readLine().trim().split("\\s++");
			int x=Integer.valueOf(s3[0]);
			int y=Integer.valueOf(s3[1]);
			pw.println(dist[x]+dist[y]);
			
		}
	pw.close();
		
	}
	static class Edge
	{
		int v;
		int w;
		public Edge(int v,int w)
		{
			this.v=v;
			this.w=w;
		}
	}
	 static long solve(int[] A, int k){
	       //int[] sum=new int[A.length+k+1];
	     ///  for(int i=1;i<=A.length;i++)
		 int n=A.length-1;
	       long ans=0;
	      /// Arrays.sort(A);
	       for(int i=1;i<=n-k+1;i++)
	       {
	           ans=Math.max(ans,Math.abs(A[i]-A[i+k-1]));
	       }
	       
	       return ans;
	    }
	public static boolean palin(String s)
	{
	   int i=0;
	   int j=s.length()-1;
	   while(i<j)
	   {
		   if(s.charAt(i)==s.charAt(j))
		   {
			   i++;
			   j--;
		   }
		   else return false;     
	   }
	   return true;
	}
	
}

