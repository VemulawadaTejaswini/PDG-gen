import java.util.*;
public class Main 
{	
	public static void main(String[] args) 
	{
		Set<Integer> tSet = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; ++i)
		{
			int temp = sc.nextInt();
			list.add(temp);
		}
		Collections.sort(list);
		int m = sc.nextInt();
		for(int i = 0; i < m; ++i)
		{
			int temp = sc.nextInt();
			tSet.add(temp);
		}
		int count = 0;
		Iterator<Integer> it = tSet.iterator();
		while(it.hasNext())
		{
			int num = it.next();
			for(int i = 0; i < n; ++i)
			{
				if(num < list.get(i))
				{
					break;
				}
				else if(num == list.get(i))
				{
					++count;
				}
			}
		}
		System.out.println(count);
	}
}