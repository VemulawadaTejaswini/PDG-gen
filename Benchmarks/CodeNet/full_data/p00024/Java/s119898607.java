import java.util.*;
public class Main 
{

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			double v = stdIn.nextDouble();
			int N = 2;
			while(true)
			{
				double velocity = 1.4 * Math.sqrt(10 * (5 * N - 5));
				if(velocity >= v)
				{
					System.out.println(N);
					break;
				}
				++N;
			}
		}
	}
}