import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			int n = sc.nextInt();
			if(n==0)
				return;
			int a[][] = new int[n+1][n+1];
			int sum2=0;
			int total =0;
			for(int i=0; i<n; i++)
			{
				int j=0;
				int sum1=0;

				for(j=0; j<n; j++)
				{
					a[i][j] = sc.nextInt();
					sum1+=a[i][j];		
				}
				a[i][j]=sum1;
				total+=sum1;

			}
			a[n][n]=total;
			int i=0;
			int j=0;
			while(i<n)
			{
				sum2=0;
				for(j=0; j<n; j++)
				{
					sum2+=a[j][i];
				}
				a[j][i]=sum2;
				i++;
			}
			for(i=0; i<=n; i++)
			{
				for(j=0; j<=n; j++)
				{
					System.out.printf("%5d",a[i][j]);

				}
				System.out.println();
			}
		}

	}

}