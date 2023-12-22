import java.util.ArrayList;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int m=in.nextInt();
			ArrayList<Integer> L=new ArrayList<Integer>();
			for(int i=1;i<=2*n;i++)
				L.add(i);
			for(int i=0;i<m;i++)
			{
				int k=in.nextInt();
				if(k==0)
				{
					ArrayList<Integer> L1=new ArrayList<Integer>();
					ArrayList<Integer> L2=new ArrayList<Integer>();
					for(int j=0;j<n;j++)
						L1.add(L.get(j));
					for(int j=n;j<2*n;j++)
						L2.add(L.get(j));
					L=new ArrayList<Integer>();
					for(int j=0;j<n;j++)
					{
						L.add(L1.get(j));
						L.add(L2.get(j));
					}
				}
				else
				{
					ArrayList<Integer> L1=new ArrayList<Integer>();
					ArrayList<Integer> L2=new ArrayList<Integer>();
					for(int j=0;j<k;j++)
						L1.add(L.get(j));
					for(int j=k;j<2*n;j++)
						L2.add(L.get(j));
					L=new ArrayList<Integer>();
					for(int j=0;j<L2.size();j++)
						L.add(L2.get(j));
					for(int j=0;j<L1.size();j++)
						L.add(L1.get(j));
				}
			}
			for(int i=0;i<L.size();i++)
				System.out.println(L.get(i));
	}
}