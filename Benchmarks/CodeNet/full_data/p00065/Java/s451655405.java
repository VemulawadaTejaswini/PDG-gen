import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> first = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> second = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> current = first;
		HashSet<Integer> customers = new HashSet<Integer>();
		int index = 0;
		while (sc.hasNext())
		{
			String str = sc.nextLine();
			if (str.equals(""))
			{
				current = second;
			}
			else
			{
				Scanner setScan = new Scanner(str).useDelimiter("[,\n]");
				int id = setScan.nextInt();
				customers.add(id);
				int date = setScan.nextInt();
				Integer count = current.get(id);
				if (count == null)
				{
					count = 1;
				}
				else
				{
					count += 1;
				}
				current.put(id, count);
			}
		}
		Integer cus[] = customers.toArray(new Integer[0]);
		Arrays.sort(cus);
		for (int i = 0; i < cus.length; i++)
		{
			Integer f = first.get(cus[i]);
			Integer s = second.get(cus[i]);
			if (f != null && s != null)
			{
				System.out.printf("%d %d\n", cus[i], f + s);
			}
		}
	}
}