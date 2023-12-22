import java.util.Scanner;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			HashMap<Integer, LinkedBlockingQueue<Character>> table = new HashMap<Integer, LinkedBlockingQueue<Character>>();
			int points[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				Character name = sc.next().charAt(0);
				int total = 0;
				for (int j = 0; j < n - 1; j++)
				{
					switch (sc.nextInt())
					{
					case 0:
						total += 100;
						break;
					case 1:
						total--;
						break;
					case 2:
						break;
					}
				}
				points[i] = total;
				LinkedBlockingQueue<Character> sta = table.get(total);
				if (sta == null)
				{
					sta = new LinkedBlockingQueue<Character>();
				}
				sta.offer(name);
				table.put(total, sta);
			}
			Arrays.sort(points);
			for (int i = n-1; i >= 0; i--)
			{
				LinkedBlockingQueue<Character> sta = table.get(points[i]);
				System.out.println(sta.poll());
			}
		}
	}
}