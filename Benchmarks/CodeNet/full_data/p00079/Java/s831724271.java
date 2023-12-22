import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static class Position
	{
		double x, y;
	}
	static ArrayList<Position> pos = new ArrayList<>();
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			String[] input = scanner.next().split(",");
			Position p = new Position();
			p.x = Double.parseDouble(input[0]);
			p.y = Double.parseDouble(input[1]);
			pos.add(p);
		}
		
		double sum = 0;
		for(int i=2; i<pos.size(); i++)
		{
			double a = distance(0, i-1);
			double b = distance(0, i);
			double c = distance(i-1, i);
			
			double z = (a+b+c) / 2;
			sum += Math.sqrt(z*(z-a)*(z-b)*(z-c));	
		}
		
		System.out.printf("%1$.6f", sum);
	}
	
	static double distance(int m, int n)
	{
		double x = pos.get(m).x - pos.get(n).x;
		double y = pos.get(m).y - pos.get(n).y;
		return Math.sqrt(x*x + y*y);
	}
}