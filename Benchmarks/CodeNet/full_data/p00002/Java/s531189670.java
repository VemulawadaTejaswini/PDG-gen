import java.util.*;

public class Main
{

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine())
		{
			String s = "";
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int a = x + y;
			String s1 = "" + a;
			int b = s1.length();
			s += b;
			s += "\r";
			System.out.println(s);
		}					
	}
}