import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int point1 = 0, point2 = 0;
		for(int i = 0; i < n; ++i)
		{
			String s1 = stdIn.next();
			String s2 = stdIn.next();
			if(s1.equals(s2))
			{
				++point1;
				++point2;
			}
			else
			{
				boolean flag = true;
				int m = (s1.length() > s2.length() ? s2.length(): s1.length());
				for(int j = 0; j < m; ++j)
				{
					if(s1.charAt(j) > s2.charAt(j))
					{
						point1 += 3;
						flag = false;
						break;
					}
					else if(s1.charAt(j) < s2.charAt(j))
					{
						point2 += 3;
						flag = false;
						break;
					}
				}
				if(flag)
				{
					if(s1.length() > s2.length())
					{
						point1 += 3;
					}
					else
					{
						point2 += 3;
					}
				}
			}
		}
		System.out.println(point1 + " " + point2);
	}
}