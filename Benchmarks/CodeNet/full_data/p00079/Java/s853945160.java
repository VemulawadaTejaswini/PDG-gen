import java.util.*;
class Pair
{
	double x;
	double y;
	Pair(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
}

public class Main 
{
	public static double helon(Pair p1, Pair p2, Pair p3)
	{
		double a = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
		double b = Math.sqrt((p1.x - p3.x) * (p1.x - p3.x) + (p1.y - p3.y) * (p1.y - p3.y));
		double c = Math.sqrt((p2.x - p3.x) * (p2.x - p3.x) + (p2.y - p3.y) * (p2.y - p3.y));
		double z = (a + b + c) / 2;
		return(Math.sqrt(z * (z - a) * (z - b) * (z - c)));
	}
	
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		List<Pair> list = new ArrayList<Pair>();
		while(stdIn.hasNext())
		{
			String[] str = stdIn.next().split(",");
			double x = Double.parseDouble(str[0]);
			double y = Double.parseDouble(str[1]);
			list.add(new Pair(x, y));
		}
		double sum = 0;
		for(int i = 1; i < list.size() - 1; ++i)
		{
			sum += helon(list.get(0), list.get(i), list.get(i + 1));
		}
		System.out.println(sum);
	}
}