import java.util.*;

class Pair
{
	int num;
	int walk;
	Pair(int num, int walk)
	{
		this.num = num;
		this.walk = walk;
	}
}
public class Main 
{
	
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			List<Pair> list = new ArrayList<Pair>();
			for(int i = 0; i < n; ++i)
			{
				int num = stdIn.nextInt();
				int day1 = stdIn.nextInt();
				int day2 = stdIn.nextInt();
				list.add(new Pair(num, day1 + day2));
			}
			Collections.sort(list, new Comparator<Pair>()
			{ 
				public int compare(Pair t1, Pair t2)
				{
					return (t1.walk - t2.walk); 
				}
			} );
			System.out.println(list.get(list.size() - 1).num + " " + list.get(list.size() - 1).walk);
		}
	}
}