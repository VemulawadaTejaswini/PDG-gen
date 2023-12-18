/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner e = new Scanner(System.in);
		
		int n = e.nextInt();
		int a = e.nextInt();
		int b = e.nextInt();
		int c = e.nextInt();
		int d = e.nextInt();
		
		String s = e.next();
		int ans = -1;
		int cnt = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '#')
			{
				cnt++;
				ans = Math.max(ans, cnt);
			}
			else
			{
				cnt = 0;
			}
		}
		
		boolean ok = true;
		if(cnt <= 2)
		{
			int sr = Math.min(c, d);
			if(s.charAt(sr - 1 - 1) == '#' && s.charAt(sr - 1 - 1 - 1) == '#' )
			{
				ok = false;
			}
			else
			{
				ok = true;
			}
		}
		else
		{
			System.out.println("No");
		}
		
		if(ok)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
	}
}