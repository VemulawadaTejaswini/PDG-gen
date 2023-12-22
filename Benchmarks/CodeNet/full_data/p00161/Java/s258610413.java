import java.util.Scanner;
import java.util.HashMap;
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
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int times[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				int c = sc.nextInt(),
					m1 = sc.nextInt(),
					s1 = sc.nextInt(),
					m2 = sc.nextInt(),
					s2 = sc.nextInt(),
					m3 = sc.nextInt(),
					s3 = sc.nextInt(),
					m4 = sc.nextInt(),
					s4 = sc.nextInt();
				int time = (m1 + m2 + m3 + m4) * 60 + s1 + s2 + s3 + s4;
				times[i] = time;
				map.put(time, c);
			}
			Arrays.sort(times);
			System.out.println(map.get(times[0]));
			System.out.println(map.get(times[1]));
			System.out.println(map.get(times[n - 2]));
		}
	}
}