import java.util.*;
class Main
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String s = "";
		while(s.length() != 1)
		{
			int temp = 0;
			for(int i =0;i<str.length();i++)
			{
				String num = "" + str.charAt(0);
				temp += Integer.parseInt(num);
			}
			s = s + temp;
		}
		if(s == "9")
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
	}	
}