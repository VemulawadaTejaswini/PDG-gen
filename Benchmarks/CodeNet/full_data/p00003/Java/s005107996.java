import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main
{

	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] h=new int[3];
		int max=0;
		String[] ans=new String[N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<3;j++)
			{
				h[j]=(int)Math.pow(sc.nextInt(),2);
			}
			Arrays.sort(h);
			ans[i]=(h[0]+h[1]==h[2])?"YES":"NO";
		}
		for(String disp:ans)
		{
			System.out.println(disp);
		}
	}

}