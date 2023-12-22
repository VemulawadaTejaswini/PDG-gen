import java.util.*;
class P
{
	int b;
	int x;
	int y;
	P(int b, int x, int y)
	{
		this.b = b;
		this.x = x;
		this.y = y;
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int N = stdIn.nextInt();
			if(N == 0)
			{
				break;
			}
			int xMin = 0;
			int xMax = 0;
			int yMin = 0;
			int yMax = 0;
			List<P> list = new ArrayList<P>();
			list.add(new P(0, 0, 0));
			--N;
			int count = 0;
			while(N-- != 0)
			{
				int n = stdIn.nextInt();
				int d = stdIn.nextInt();
				++count;
				for(int i = 0; i < list.size(); ++i)
				{
					if(list.get(i).b == n)
					{
						if(d == 0)
						{
							list.add(new P(count, list.get(i).x - 1, list.get(i).y));
							if(list.get(i).x - 1 < xMin)
							{
								xMin = list.get(i).x - 1;
							}
						}
						else if(d == 1)
						{
							list.add(new P(count, list.get(i).x, list.get(i).y - 1));
							if(list.get(i).y - 1 < yMin)
							{
								yMin = list.get(i).y - 1;
							}
						}
						else if(d == 2)
						{
							list.add(new P(count, list.get(i).x + 1, list.get(i).y));
							if(list.get(i).x + 1 > xMax)
							{
								xMax = list.get(i).x + 1;
							}
						}
						else if(d == 3)
						{
							list.add(new P(count, list.get(i).x, list.get(i).y + 1));
							if(list.get(i).y + 1 > yMax)
							{
								yMax = list.get(i).y + 1;
							}
						}
						break;
					}
				}
			}
			System.out.println((xMax - xMin + 1) + " " + (yMax - yMin + 1));
		}
	}
}