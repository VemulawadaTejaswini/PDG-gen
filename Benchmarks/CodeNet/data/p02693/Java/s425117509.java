import java.util.*;
public class Main
{
	public  static  void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		int n=b-a;
		if(k==1)
		{
			System.out.println("OK");
			//break;
		}
		else
		{
			if(n>=k)
			{
				System.out.println("OK");
				//break;
			}
			else
			{
				System.out.println("NG");
				//break;
			}
		}
	}
}