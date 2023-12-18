import java.io.*;
import java.util.*;

public class Main
{

	static OutputStream outputStream = System.out;
	static PrintWriter out = new PrintWriter(outputStream);

	static class node implements Comparable<node>
		{
			int data;int indx;
	
			node(int i,int o)
			{
				data=i;indx=o;
			}
			public int compareTo(node n)
			{
				if(this.data!=n.data) return this.data-n.data;
				return this.indx-n.indx;
			}
		}
	
	public static void main(String[] Rohan)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String[] s=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]);


		node[] a=new node[n];


		for(int i=0;i<n;i++)
		{
			s=br.readLine().split(" ");
			a[i]=new node(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
		}

		Arrays.sort(a);


		long ans=0;

		for(int i=0;i<n;i++)
		{
			if(m<=0) break;

			long temp=a[i].data;
			temp*=Math.min(m,a[i].indx);
			m-=Math.min(m,a[i].indx);
			ans+=temp;
		}

		
		out.println(ans);
		out.close();
		

	}
}