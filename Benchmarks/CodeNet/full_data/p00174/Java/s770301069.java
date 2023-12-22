import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			String str = stdIn.next();
			if(str.equals("0"))
			{
				break;
			}
			int pointA = 0;
			int pointB = 0;
			for(int i = 1; i < str.length(); ++i)
			{
				if(str.charAt(i) == 'A')
				{
					++pointA;
				}
				else
				{
					++pointB;
				}
			}
			if(pointA > pointB)
			{
				++pointA;
			}
			else
			{
				++pointB;
			}
			System.out.println(pointA + " " + pointB);
		}
	}
}