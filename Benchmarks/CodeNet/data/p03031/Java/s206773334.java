
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		ArrayList<List<Integer>> adj=new ArrayList<List<Integer>>();
		for(int i=0;i<m;i++)
		{
			adj.add(new ArrayList<Integer>());
			
			int k=scan.nextInt();
			for(int j=0;j<k;j++)
			{
				adj.get(i).add(scan.nextInt());
				
			}
		}
		int p[]=new int[m];
		for(int i=0;i<m;i++)
		{
			p[i]=scan.nextInt();
		}
		int ans=0;
//		for(int i=0;i<m;i++)
//		{
//			for(int x:adj.get(i))
//			{
//				System.out.print(x+" ");
//			}
//			System.out.println();
//		}
		for(int i=0;i<=(1<<n);i++)
		{
//			System.out.println(i);
			boolean ok=true;
			for(int j=0;j<m;j++)
			{
			
				int c=0;
				for(int id:adj.get(j)) {
					if(((i>>(id-1))&1)==1)
					{
//						System.out.println("gg");
						++c;
					}
					
				}
				if((c%2)!=p[j])
				{
				ok=false;
//				break;
				}
			}
			if(ok)
			{
				++ans;
			}
		}
		System.out.println(ans);
	}
}
