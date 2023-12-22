import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		boolean not[] = new boolean[1000000];
		not[0] = true;
		not[1] = true;
		for (int i = 2; i * i < 1000000; i++)
		{
			if (not[i]) continue;
			for (int x = (i << 1); x < 1000000; x += i)
			{
				if (not[x]) continue;
				not[x] = true;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			int sum = 0;
			int count = 0;
			int i = 0;
			while (count < n)
			{
				if (!not[i])
				{
					sum += i;
					count++;
				}
				i++;
			}
			System.out.println(sum);
		}
	}
}