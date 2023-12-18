import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		
		int a=0;
		int b=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A')
			{
				a++;
			}
			else
			{
				b++;
			}
		}
		
		if(a==3||b==3)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
		
	}
	
}