import java.util.Scanner;

public class Main
{
	public static void main(String[]args)
	{
		Scanner scn = new Scanner(System.in);
		int ques = scn.nextInt();
		int ans = 1;
		for(int a= 0;a<3;a++)
		{
			ans = ans*ques;
		}
		System.out.println(ans);
	}
}