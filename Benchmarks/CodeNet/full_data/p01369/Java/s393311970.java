import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			String str = stdIn.next();
			if(str.equals("#"))
			{
				break;
			}
			boolean flag;
			if(str.charAt(0) == 'y' || str.charAt(0) == 'u' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || 
			   str.charAt(0) == 'p' || str.charAt(0) == 'h' || str.charAt(0) == 'j' || str.charAt(0) == 'k' || 
			   str.charAt(0) == 'l' || str.charAt(0) == 'n' || str.charAt(0) == 'm')
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
			int count = 0;
			for(int i = 0; i < str.length(); ++i)
			{
				if(!flag)
				{
					if(str.charAt(i) == 'y' || str.charAt(i) == 'u' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
					   str.charAt(i) == 'p' || str.charAt(i) == 'h' || str.charAt(i) == 'j' || str.charAt(i) == 'k' || 
					   str.charAt(i) == 'l' || str.charAt(i) == 'n' || str.charAt(i) == 'm')
					{
						flag = !flag;
						++count;
					}
				}
				else
				{
					if(!(str.charAt(i) == 'y' || str.charAt(i) == 'u' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
					   str.charAt(i) == 'p' || str.charAt(i) == 'h' || str.charAt(i) == 'j' || str.charAt(i) == 'k' || 
					   str.charAt(i) == 'l' || str.charAt(i) == 'n' || str.charAt(i) == 'm'))
					{
						flag = !flag;
						++count;
					}
				}
			}
			System.out.println(count);
			
		}
	}
}