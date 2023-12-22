import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int te[]=new int[n+1];
			for(int i=0;i<n*(n-1)/2;i++)
			{
				int a=in.nextInt(),b=in.nextInt();
				int as=in.nextInt(),bs=in.nextInt();
				if(as>bs)
					te[a]+=3;
				else if(bs>as)
					te[b]+=3;
				else
				{
					te[a]+=1;
					te[b]+=1;
				}
			}
			for(int i=1;i<=n;i++)
			{
				int rank=1;
				for(int j=1;j<=n;j++)
					if(te[i]<te[j])
						rank++;
				System.out.println(rank);
			}
		}
	}
}