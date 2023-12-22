import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long c = 0;
		
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < m;j++)
			{
				A[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < l;j++)
			{
				B[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < l;j++)
			{
				c = 0;
				for(int k = 0;k < m;k++)
				{
					c += (A[i][k] * B[k][j]);
				}
				if(j != 0){System.out.print(" ");}
				System.out.print(c);
			}
			System.out.println("");
		}
	}
}