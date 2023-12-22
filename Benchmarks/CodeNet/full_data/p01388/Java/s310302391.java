import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.next();
		int kcount = 0, ucount = 0, pcount = 0, ccount = 0;
		for(int i = 0; i < str.length(); ++i)
		{
			if(str.charAt(i) == 'K')
			{
				++kcount;
			}
			else if(str.charAt(i) == 'U')
			{
				++ucount;
			}
			else if(str.charAt(i) == 'P')
			{
				++pcount;
			}
			else if(str.charAt(i) == 'C')
			{
				++ccount;
			}
		}
		int min = 999999999;
		if(kcount < min)
		{
			min = kcount;
		}
		if(ucount < min)
		{
			min = ucount;
		}
		if(pcount < min)
		{
			min = pcount;
		}
		if(ccount < min)
		{
			min = ccount;
		}
		System.out.println(min);
	}
}