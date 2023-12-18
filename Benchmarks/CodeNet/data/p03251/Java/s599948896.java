import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt(), x = -100, y = 100 ,xmax = 0, ymin = 0;

		for (int i = 1; i <=  N; i++)
		{
			x = sc.nextInt();
			if (x > xmax)
				xmax = x;
		}

		for (int i = 1; i <= M; i++);
		{
			y = sc.nextInt();
			if (y < ymin)
				ymin = y;
		}

		if (ymin > xmax && Y > X)
			System.out.println("No War");
		else
			System.out.println("War");
	}
}