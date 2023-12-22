import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LinkedBlockingQueue<Integer> que = new LinkedBlockingQueue<Integer>(1000);
		while (true)
		{
			int n = sc.nextInt(),
				k = sc.nextInt();
			if (n == 0 && k == 0) break;
			que.clear();
			int i;
			long total = 0;
			for (i = 0; i < k; i++)
			{
				int a = sc.nextInt();
				que.offer(a);
				total += a;
			}
			long max = total;
			for (; i < n; i++)
			{
				int a = sc.nextInt();
				total = total + a - que.poll();
				que.offer(a);
				max = Math.max(max, total);
			}
			System.out.println(max);
		}
	}
}