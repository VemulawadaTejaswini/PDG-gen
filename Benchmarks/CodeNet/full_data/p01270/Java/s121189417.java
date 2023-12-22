import java.util.*;

class Main
{
	static Long start;
	static HashMap<Long, Long> fsys;
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		while (true)
		{
			int n = sc.nextInt();
			fsys = new HashMap<Long, Long>();
			start = 0L;
			if (n == 0) break;
			for (int i = 0; i < n; i++)
			{
				switch (sc.next().charAt(0))
				{
				case 'W':
					write();
					break;
				case 'R':
					read();
					break;
				case 'D':
					delete();
					break;
				}
				//for (Long j = 0L; j < 10L; j++)
				//	System.out.println(fsys.get(j));
			}
		}
	}
	private static void write()
	{
		Long x = sc.nextLong();
		Long n = sc.nextLong();
		Long i;
		for (i = start; i < 1000000000L; i++)
		{
			if (fsys.get(i) != null) continue;
			fsys.put(i, x);
			n--;
			if (n == 0) break;
		}
		start = i + 1L;
	}
	private static void read()
	{
		Long n = sc.nextLong();
		Long value = fsys.get(n);
		if (value == null)
		{
			System.out.println(-1);
		}
		else System.out.println(value);
	}
	private static void delete()
	{
		Long n = sc.nextLong();
		Set<Long> key = fsys.keySet();
		Iterator<Long> it = key.iterator();
		while (it.hasNext())
		{
			Long i = it.next();
			if (fsys.get(i) == n)
			{
				it.remove();
			}
			start = Math.min(i, start);
		}
	}
}