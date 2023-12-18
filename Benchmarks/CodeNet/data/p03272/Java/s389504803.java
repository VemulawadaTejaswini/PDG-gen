package beginner_contest_107;

import java.util.Scanner;

public class train
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		i=sc.nextInt();
		if(i==n)
			System.out.println(1);
		else
		{
			System.out.println(n-i+1);
		}
	}
}
