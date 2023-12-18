import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		int n=str.length();
		
		int c=0;
		
		if(check(str))
			c++;
		if(check(str.substring(0,(n-1)/2)))
		{
			c++;
		}
		if(check(str.substring(((n+3)/2)-1,n)))
		{
			c++;
		}
		
		if(c==3)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	public static boolean check(String str)
	{
		int p=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				p=1;
				break;
			}
		}
		
		if(p==1)
			return false;
		else
			return true;
	}
	
}