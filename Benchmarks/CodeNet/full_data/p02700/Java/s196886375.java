import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		
		int c=s.nextInt();
		int d=s.nextInt();
		
		int one=a/d;
		int two=c/b;
		
		if(a%d!=0)
		{
			one++;
		}
		
		if(c%b!=0)
		{
			two++;
		}
		
		if(two<=one)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
	
}