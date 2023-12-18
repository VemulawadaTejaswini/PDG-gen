import java.util.Scanner;

public class Main {
	public static void main(String argvs[])
	{
		Scanner x = new Scanner(System.in);
		String s = x.next();
		String t = x.next();
		int flag = 0;
		if(s.length() != t.length())
		{
			System.out.print("No");
		}
		else
		{
			if(s.equalsIgnoreCase(t))
			{
				flag =1;
			}
			int counter = s.length();
			while(counter > 0)
			{
				s = operation(s);
				if(s.equalsIgnoreCase(t))
				{
					flag = 1;
					break;
				}
				else
				{
					counter --;
				}
			}
			if(flag == 1)
			{
				System.out.print("Yes");
			}
			else
				System.out.print("No");
			
		}
	}
	
	static String operation(String s)
	{
		char c = s.charAt(s.length()-1);
		char d = s.charAt(0);
		String g = s.substring(0, s.length() - 1);
		StringBuilder g1 = new StringBuilder(g);
		g1.insert(0, c);
		//String g = String.valueOf(c) + g1;
		/*StringBuilder myName = new StringBuilder(s);
		myName.replace(0, 0,String.valueOf(c));
		myName.replace(s.length()-1, s.length()-1, String.valueOf(d));
		//s = String.valueOf(c) + s.substring(1, s.length()-2) + String.valueOf(d);
		*///System.out.println(g1.toString());
		return g1.toString();
	}
	

}
