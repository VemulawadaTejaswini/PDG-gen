import java.util.Scanner;

public class Main {
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.nextLine();

		for (int i = 0; i < n; ++i)
		{
			if (s.charAt(i) == 'D')
			{
				--n;
			}
			else
			{
				++n;
			}
		}

		System.out.println(n);
	}
}