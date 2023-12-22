import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int p=in.nextInt();
			if((n|p)==0)
				return;
			int N[]=new int[n];
			int i=0;
			int r=p;
			for(;;)
			{
				if(r!=0)
				{
					N[i]++;
					r--;
				}
				else
				{
					r=N[i];
					N[i]=0;
				}
				if(N[i]==p)
					break;
				i++;
				i%=n;
			}
			System.out.println(i);
		}
	}
}