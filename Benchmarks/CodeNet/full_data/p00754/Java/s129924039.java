import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s;
		for(;;)
		{
			s = sc.nextLine();
			if (s.charAt(0) == '.') break;
			
			s = uvoa(s);
			for(;;)
			{
				int before = s.length();
				s = s.replaceAll("\\(\\)|\\[\\]", "");
				if (before == s.length()) break;
			}
			System.out.println(s.charAt(0) == '.' ? "yes" : "no");
		}
	}
	
	private static String uvoa(String s)
	{
		StringBuilder buf = new StringBuilder();
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if ("()[].".indexOf(c) != -1) buf.append(c);
		}
		return buf.toString();
	}
}