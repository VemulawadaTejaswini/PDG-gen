import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a==b&&b!=c)
		{
			System.out.println("yes");
		}
		if(a==c&&a!=b)
		{
			System.out.println("yes");
		}
		if(b==c&&a!=c)
		{
			System.out.println("yes");
		}
		if(a==b&&b==c&&a==c)
		{
			System.out.println("no");
		}
		if(a!=b&&a!=c&&b!=c)
		{
			System.out.println("no");
		}
			
	}
}