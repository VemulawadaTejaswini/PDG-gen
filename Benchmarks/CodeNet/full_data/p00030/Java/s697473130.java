
import java.util.Scanner;

public class Main
{
	static int gs;
	static int sum;
	static int count=0;
	static int[]book;
	static int[]a;
	public static void dfs(int zhi,int step)
	{
		if(zhi>sum||step>gs)return ;
		if(step==gs&&zhi==sum)
		{
			count++;
			return ;
		}
		else
		{
			for(int i=zhi;i<=sum;i++)
			{
				if(book[i]==0)
				{
					book[i]=1;
					dfs(zhi+i,step+1);
					book[i]=0;
				}
			}
		}
		return ;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			gs=sc.nextInt();
			sum=sc.nextInt();
			if(gs==0&&sum==0)break;
			count=0;
			book=new int[sum+1];
			a=new int[sum+1];
			dfs(0,0);
			System.out.println(count);
		}
	}

}

