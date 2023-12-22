import java.util.Scanner;
import java.lang.String;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[] sum = new int[55];
		String s;
		int b;
		while (input.hasNext())
		{
			s = input.next();
			for(int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				{
					b = (int)(s.charAt(i)-'A');
					sum[b]++;
				}
				else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
					b = (int)(s.charAt(i)-'a');
					sum[b]++;
				}
			}
		}
		for(int i = 0; i < 26; i++)
		{
			System.out.println((char)('a' + i) + " : " + sum[i]);
		}
	}
}