import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		while ((n = sc.nextInt()) != 0)
		{
			int s[] = new int[n];
			int c[] = new int[n];
			int loop = 0;
			
			for (int i = 0; i < n; i++)
			{
				s[i] = sc.nextInt();
			}
			while (true)
			{
				for (int i = 0; i < n; i++)
				{
					int count = 0;
					for (int j = 0; j < n; j++)
					{
						if (s[i] == s[j]) count++;
					}
					c[i] = count;
				}
				if (check(s, c))
				{
					for (int i = 0; i < n; i++)
					{
						s[i] = c[i];
					}
					loop++;
				}
				else
				{
					break;
				}
			}
			
			System.out.println(loop);
			int i;
			for (i = 0; i < n-1; i++)
			{
				System.out.print(Integer.toString(c[i]) + " ");
			}
			System.out.println(c[i]);
		}
	}
	private static boolean check(int a[], int b[])
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != b[i]) return true;
		}
		return false;
	}
}