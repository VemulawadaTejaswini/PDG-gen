import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int x = scanner.nextInt();
		int [] t = new int[N];
		int max = 0;
		for(int i = 0; i < N; ++i)
		{
			t[i] = scanner.nextInt();
			if(t[i] > max)
			{
				max = t[i];
			}
		}
		int min = min(t);
		if(N >= 2 && N <= 2000
				&& min >= 1 && max <= 10E9
				&& x >= 1 && x <= 10E9)
		{
			int total = 0;
			for(int n : t)
			{
				if(x + min > n)
				{
					total += n;
				}
				else
				{
					total += x + min;
					if(n == t[t.length - 1])
					{
						total -= x;
					}
				}
			}
			System.out.println(total);
		}
	}

	public static int min(int [] num)
	{
		int min = num[0];
		for(int n : num)
		{
			if(n < min)
			{
				min = n;
			}
		}
		return min;
	}
}
