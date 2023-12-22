import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=1000000;
		boolean p[]=new boolean[N+1];
		Arrays.fill(p, true);
		p[0]=p[1]=false;
		for(int i=2;i*i<=N;i++)
		{
			if(!p[i])
				continue;
			for(int j=i+i;j<=N;j+=i)
				p[j]=false;
		}
		for(;;)
		{
			int a=in.nextInt(),b=in.nextInt(),n=in.nextInt();
			if((a|b|n)==0)
				return;
			int c=0;
			for(;;)
			{
				if(p[a])
					c++;	
				if(c==n)
				{
					System.out.println(a);
					break;
				}
				a+=b;
			}
		}
	}
}