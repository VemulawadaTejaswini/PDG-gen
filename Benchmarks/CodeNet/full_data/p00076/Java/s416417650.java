import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			double x = 0;
			double y = 0;
			double angle = 0;
			while(n-- != 0)
			{
				x += Math.cos(angle);
				y += Math.sin(angle);
				angle = Math.PI / 2 + Math.atan2(y, x);
			}
			System.out.println(x);
			System.out.println(y);
		}
	}
}