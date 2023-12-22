import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			String ans = stdIn.next();
			String inquire = stdIn.next();
			if(ans.equals("0") && inquire.equals("0"))
			{
				break;
			}
			int hit = 0, blow = 0;
			for(int i = 0; i < ans.length(); ++i)
			{
				if(ans.charAt(i) == inquire.charAt(i))
				{
					++hit;
				}
			}
			for(int i = 0; i < ans.length(); ++i)
			{
				for(int j = 0; j < inquire.length(); ++j)
				{
					if(ans.charAt(i) == inquire.charAt(j))
					{
						++blow;
					}
				}
			}
			System.out.println(hit + " " + (blow - hit));
		}
	}
}