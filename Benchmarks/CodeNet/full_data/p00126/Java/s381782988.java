import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		while(N-->0)
		{
			int a[][]=new int[9][9];
			boolean b[][]=new boolean[9][9];
			for(int i=0;i<9;i++)
				for(int j=0;j<9;j++)
				{
					a[i][j]=in.nextInt();
					b[i][j]=true;
				}
			for(int i=0;i<9;i++)
				for(int j=0;j<9;j++)
					for(int k=j+1;k<9;k++)
					{
						if(a[i][j]==a[i][k])
							b[i][j]=b[i][k]=false;
						if(a[j][i]==a[k][i])
							b[j][i]=b[k][i]=false;
					}
			for(int i=0;i<9;i++)
			{
				for(int j=0;j<9;j++)
					System.out.print(b[i][j] ? " "+a[i][j] : "*"+a[i][j]);
				System.out.println();
			}
		}
	}
}