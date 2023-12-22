import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean[] flag = new boolean[1000000];
		for(int i=2;i*i<=1000000;i++)
		{
			if(!flag[i])
			{
				for(int j=i*2;j<=1000000;j+=i)
				{
					flag[j] = true;
				}
			}
		}
		
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			int count = 0;
			for(int i=2;i<=n;i++)
			{
				if(!flag[i]) count++;
			}
			System.out.println(count);
		}
	}
}