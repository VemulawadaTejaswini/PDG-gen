import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedBlockingQueue<Integer> cards = new LinkedBlockingQueue<Integer>();
		for (int i = 1; i <= n * 2; i++)
			cards.offer(i);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++)
		{
			int k = sc.nextInt();
			if (k == 0)
			{
				Integer tmp[] = new Integer[n*2];
				tmp = (Integer[]) cards.toArray(tmp);
				cards.clear();
				for (int j = 0; j < n; j++)
				{
					cards.offer(tmp[j]);
					cards.offer(tmp[j+n]);
				}
			}
			else
			{
				for (int j = 0; j < k; j++)
				{
					int a = cards.poll();
					cards.offer(a);
				}
			}
		}
		for (int i = 0; i < n * 2; i++)
		{
			System.out.println(cards.poll());
		}
	}
}