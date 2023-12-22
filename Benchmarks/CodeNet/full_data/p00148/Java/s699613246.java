import java.util.Scanner;

public class Main
{
	public static void main(String aeg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			int ans = n%39;
			if(ans == 0)
				ans = 39;
			if(ans>=10)
				System.out.println("3C"+ans);
			else
				System.out.println("3C0"+ans);
		}
	}
}