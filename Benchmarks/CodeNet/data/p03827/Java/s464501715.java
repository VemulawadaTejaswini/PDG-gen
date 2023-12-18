

import java.util.Scanner;

public class Main {
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		int i = 0;

		while (true)
		{
			i = s.indexOf('I');

			if (i == -1) { break; }
			else{ ++i; ++n; }
		}

		i = 0;

		while (true)
		{
			i = s.indexOf('D');

			if (i == -1) { break; }
			else{ ++i; --n; }
		}

		System.out.println(n);
	}
}
