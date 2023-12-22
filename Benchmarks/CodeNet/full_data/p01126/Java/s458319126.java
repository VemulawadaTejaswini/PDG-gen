import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt(),m=in.nextInt(),a=in.nextInt();
			if((n|m|a)==0)
				return;
			int B[][][]=new int[1001][n+1][n+1];
			int sh=-1;
			int sw=a;
			for(int i=0;i<m;i++)
			{
				int h=in.nextInt();
				int p=in.nextInt();
				int q=in.nextInt();
				sh=Math.max(sh,h);
				B[h][p][q]=1;
				B[h][q][p]=1;
			}
			for(;;)
			{
				for(int i=1;i<=n;i++)
				{
					if(B[sh][sw][i]==1)
					{
						sw=i;
						break;
					}
				}
				sh--;
				if(sh==0)
					break;
			}
			System.out.println(sw);
		}
	}
}