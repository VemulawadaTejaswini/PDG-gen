

import java.util.Scanner;

public class Main {
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = n;
		String s = sc.next();

		for (int i = 0; i < s.length(); ++i)
		{
			if ('I' ==  s.charAt(i))
			{
				++n;

				max = Math.max(max, n);
			}
			else
			{
				--n;
			}
		}

		System.out.println(max);
	}
}
