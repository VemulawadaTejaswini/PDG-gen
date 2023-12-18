

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int h=scan.nextInt();
		int w=scan.nextInt();
		long ar[][]=new long[h+2][w+2];
		
		for(int i=1;i<=h;i++) {
			String g=scan.next();
			for(int j=1;j<=w;j++)
			{
				if(g.charAt(j-1)=='.') {
					ar[i][j]=0;
				}else {
					ar[i][j]=-1;
				}
				
			}
		}
		ar[1][1]=1;
		for(int i=1;i<=h;i++)
		{
			for(int j=1;j<=w;j++)
			{
				if(i==1&& j==1)continue;
				if(ar[i][j]==-1)continue;
				long left=(ar[i][j-1]==-1)?0:ar[i][j-1];
//					left=left%1000000007;
				long right=(ar[i-1][j]==-1)?0:ar[i-1][j];
//					left=right%1000000007;
				ar[i][j]=(left+right)%1000000007;
//				System.out.println(ar[i][j]);
			}
		}
		System.out.println(ar[h][w]);
	}
}
