import java.util.Scanner;
public class Main
{
	public static void main(String aeg[])
	{
		Scanner in = new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int s=0;
			for(int i=0; i<(n*(n-1))/2;i++)
				s+=in.nextInt();
			System.out.println(s/(n-1));
		}
	}
}