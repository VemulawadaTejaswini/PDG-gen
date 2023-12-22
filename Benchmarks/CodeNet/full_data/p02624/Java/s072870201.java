import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long sum=0;
		long count=0;
		for(int i=1;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					if(i/j==j)
					{
						count++;
					}
					else
					{
						count=count+2;
					}
				}
			}
			sum=sum+count*i;
			
		}
		System.out.println(sum);
	}
}