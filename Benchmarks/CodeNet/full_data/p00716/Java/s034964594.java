
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();/*データがいくつか*/
		
		for(int i=0;i<n;i++)
		{
			int m = stdIn.nextInt();/*お金*/
			int y = stdIn.nextInt();/*年数*/
			int x = stdIn.nextInt();/*いくつやるか*/			
			int c = 0;/*最大値を求める変数*/
			
			for(int j=0;j<x;j++)
			{
				int z = m;/*A*/
				int w = 0;/*B*/
				int k = stdIn.nextInt();/*タン梨花福利か*/
				double s = stdIn.nextDouble();/*利率*/
				int t = stdIn.nextInt();/*手数料*/
				for(int a=0;a<y;a++)
				{
					if(k==0)
					{
						w = w + (int)(z * s);
						z = z - t;
						if(c < (z + w))
						{
							c = z + w;
						}
					}
					else
					{
						w = (int)(z * s);
						z = z + w - t;
						if(c < z)
						{
							c = z;
						}
					}
				}
			}
			System.out.println(c);
		}
	}

}