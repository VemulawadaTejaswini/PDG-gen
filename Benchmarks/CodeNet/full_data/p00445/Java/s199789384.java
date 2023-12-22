import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			String str = sc.next();
			int joi = 0, ioi = 0;
			int length = str.length();
			StringBuffer buf = new StringBuffer(str.substring(0, 3));
			if (buf.toString().equals("JOI")) joi++;
			if (buf.toString().equals("IOI")) ioi++;
			for (int i = 3; i < length; i++)
			{
				buf.setCharAt(0, buf.charAt(1));
				buf.setCharAt(1, buf.charAt(2));
				buf.setCharAt(2, str.charAt(i));
				if (buf.toString().equals("JOI")) joi++;
				if (buf.toString().equals("IOI")) ioi++;
			}
			System.out.println(joi);
			System.out.println(ioi);
		}
	}
}