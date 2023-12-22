import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		int n=b-a+1;
		if(k==1)
		{
			System.out.print("OK");
			//break;
		}
		else
		{
			if(n>=k)
			{
				System.out.print("OK");
				//break;
			}
			else
			{
				if(a%k==0 || b%k==0)
				{
					System.out.print("OK");
				}
				else
				{
					System.out.print("NG");
				}
				
				//break;
			}
		}
	}
}