import java.util.Scanner;

public class AOJ0030 {

	static int num,n,s;
	
	static void dfs(int depth,int begin,int sum)
	{
		if(depth==n)
		{
			if(sum==s)++num;
			return;
		}
		for(int i=begin;i<=9;++i)
		{
			if(sum+i<=s)
			{
				dfs(depth+1,i+1,sum+i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			n=sc.nextInt();
			s=sc.nextInt();
			if(n==0&&s==0)break;
			num=0;
			dfs(0,0,0);
			System.out.println(num);
		}
		
		sc.close();
	}

}