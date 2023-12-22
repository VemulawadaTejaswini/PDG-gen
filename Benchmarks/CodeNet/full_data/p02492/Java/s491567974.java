import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String[] str = new String[3];
			for(int i = 0; i < 3; ++i)
			{
				str[i] = sc.next();
			}
			if(str[1].equals("?"))
			{
				break;
			}
			else if(str[1].equals("+"))
			{
				System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[2]));
			}
			else if(str[1].equals("-"))
			{
				System.out.println(Integer.parseInt(str[0]) - Integer.parseInt(str[2]));
			}
			else if(str[1].equals("*"))
			{
				System.out.println(Integer.parseInt(str[0]) * Integer.parseInt(str[2]));
			}
			else if(str[1].equals("/"))
			{
				System.out.println(Integer.parseInt(str[0]) / Integer.parseInt(str[2]));
			}
			
		}
	}
}