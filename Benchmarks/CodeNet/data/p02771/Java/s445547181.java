import java.util.*;
class ans
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a!=b&&b==c)
		{
			System.out.println("yes");
		}
		if(a==b&&b!=c)
		{
			System.out.println("yes");
		}
		if(a==c&&b!=c)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}	
	}
}
