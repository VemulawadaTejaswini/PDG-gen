import java.io.*;
import java.util.*;

public class Main
{

	static class dsu
	{
		int [] par,size;
		dsu(int n)
		{
			par=new int[n];size=new int[n];
			for(int i=0;i<n;i++)
			{
				size[i]=1;par[i]=i;
			}
		}
		void merge(int x,int y)
		{
			int parx=find(x),pary=find(y);
			if(size[parx]>size[pary])
			{
				par[pary]=parx;size[parx]+=size[pary];
			}
			else
			{
				par[parx]=pary;size[pary]+=size[parx];
			}
		}
		int find(int x)
		{
			if(par[x]==x)
				return x;
			else
				return find(par[x]);
		}
	}

	
	
	
	public static void main(String[] Rohan)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");


		int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]);

		String[] s1=new String[m];

		for(int i=0;i<m;i++) s1[i]=br.readLine();

		dsu dsu=new dsu(n);

		long pair=n;

		pair*=(n-1);

		pair/=2;

		ArrayList<Long> arr=new ArrayList<Long>();

		for(int i=m-1;i>=0;i--)
		{
			arr.add(pair);
			s=s1[i].split(" ");

			int j=Integer.parseInt(s[0])-1,k=Integer.parseInt(s[1])-1;

			if(dsu.find(j)!=dsu.find(k))
			{
				long pj=(long)dsu.size[dsu.find(j)],pk=(long)dsu.size[dsu.find(k)];
				pair-=(pj*pk);
				dsu.merge(j,k);
			}
		}
		for(int i=arr.size()-1;i>=0;i--) System.out.println(arr.get(i));

			
		

	}
}