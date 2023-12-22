import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt(),k=in.nextInt();
			int a[]=new int[n];
			int max=Integer.MIN_VALUE;
			if((n|k)==0)
				return;
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			
			for(int i=0;i<n-k;i++)
			{
				int sum=0;
				for(int j=i;j<i+k;j++)
				{
					sum+=a[j];
				}
				max=Math.max(max, sum);
			}
			System.out.println(max);
		}
	}
}