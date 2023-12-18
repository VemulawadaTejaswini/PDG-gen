import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{	
	static boolean move(String s, int a, int b)
	{
		return !s.substring(a, b + 1).contains("##");
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner e = new Scanner(System.in);
		
		int n = e.nextInt();
		int s1 = e.nextInt() - 1;
		int s2 = e.nextInt() - 1;
		int t1 = e.nextInt() - 1;
		int t2 = e.nextInt() - 1;
		String s = e.next();
		
		if(t1 == t2)
		{
			System.out.println("No");
			return;
		}
		
		if(!move(s, s1, t1) || !move(s, s2, t2) )
		{
			System.out.println("No");
			return;
		}
		
		if(t1 > t2)
		{
			if(!s.substring(s2 - 1, t2 + 2).contains("..."))
			{
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
	}
}