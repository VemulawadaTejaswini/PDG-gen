import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int all = 0, total = 0, n = sc.nextInt(), m;
		while(true)
		{
			m = sc.nextInt();
			if (m == 0) break;
			total += n;
			all += total;
			n = m;
			System.out.println(total);
		}
		System.out.println(all);
	}
}