import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		String a, b;
		int m;
		int h;
		while(true)
		{
			str = sc.next();
			if(str.equals("-"))
			{
				break;
			}
			m = sc.nextInt();
			for (int i = 0; i < m; i++)
			{
				h = sc.nextInt();
				a = str.substring(0, h);
				b = str.substring(h, str.length());
				str = b + a;
			}
			System.out.println(str);
		}
		sc.close();
	}
}
