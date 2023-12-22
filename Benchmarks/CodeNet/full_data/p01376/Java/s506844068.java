import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int M=in.nextInt();
		int N=in.nextInt();
		int ans=0;
		int max=0;
		for(int i=0;i<M;i++)
		{
			 max=0;
			for(int j=0;j<N;j++)
				if(in.nextInt()==1)
					max++;
			ans=Math.max(max, ans);
		}
		System.out.println(ans);
	}
}