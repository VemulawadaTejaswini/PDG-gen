import java.util.*;
class P
{
	String name;
	int point;
	P(String name, int point)
	{
		this.name = name;
		this.point = point;
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
			List<P> data = new ArrayList<P>();
			boolean[][] point = new boolean[21][31];
			for(int i = 0; i < n; ++i)
			{
				String name = stdIn.next();
				data.add(new P(name, 0));
				int m = stdIn.nextInt();
				while(m-- != 0)
				{
					int d = stdIn.nextInt();
					point[i][d] = true;
				}
			}
			for(int i = 0; i < 31; ++i)
			{
				int count = 0;
				for(int j = 0; j < n; ++j)
				{
					if(point[j][i])
					{
						++count;
					}
				}
				for(int j = 0; j < n; ++j)
				{
					if(point[j][i])
					{
						data.get(j).point += n - count + 1;
					}
				}
			}
			Collections.sort(data, new Comparator<P>() 
				{
				    public int compare(P obj0, P obj1) 
				    {
				        return obj0.name.compareTo(obj1.name);
				    }
				}
			);

			int minIndex = 0;
			int min = 999999999;
			for(int i = 0; i < n; ++i)
			{
				if(min > data.get(i).point)
				{
					min = data.get(i).point;
					minIndex = i;
				}
			}
			System.out.println(data.get(minIndex).point + " " + data.get(minIndex).name);
		}
	}
}