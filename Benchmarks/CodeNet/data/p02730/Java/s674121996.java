import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		if(isPalindrome(s) && isPalindrome(s.substring(0, (s.length() - 1) / 2)) && isPalindrome(s.substring((s.length() + 3) / 2 - 1)))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	
	public static boolean isPalindrome(String s)
	{
		for(int i = 0; i < s.length(); ++i)
		{
			if(s.charAt(i) != s.charAt(s.length() - 1 - i))
			{
				return false;
			}
		}
		return true;
	}
}
