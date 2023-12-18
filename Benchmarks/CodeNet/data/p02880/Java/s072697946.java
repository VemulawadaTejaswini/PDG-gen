import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		int n=in.nextInt();
		int flag=0;
		if(n>81)
		{
			System.out.println("No");
		}
		else
		{
			for(int i=1;i<=9;i++)
			{
				if(n%i==0&&n/i<10)
				{
					System.out.println("Yes");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("No");
		}
	}
}
	