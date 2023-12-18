import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int Q = input.nextInt();
		int[][] a=new int[501][501];
		
		for (int i=0;i<501;i++)
			for (int j=0;j<501;j++)
				a[i][j]=0;
		
		int l=0,r=0;
		
		for (int i=1;i<=M;i++)
		{
			l = input.nextInt();
			r = input.nextInt();
			//a[l][r]--;
			
			for (int j=1;j<=N;j++)
			{
				for (int k=j;k<=N;k++)
				{
					if (j<=l&&k>=r) a[j][k]++;
				}
			}
				
		}
		
		for (int i=1;i<=Q;i++)
		{
			l = input.nextInt();
			r = input.nextInt();
			System.out.println(a[l][r]);
		}
		
	}
}
