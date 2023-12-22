import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			double a = stdIn.nextDouble();
			double sum = 0;
			for(int i = 0; i < 10; ++i)
			{
				sum += a;
				if(i % 2 == 0)
				{
					a *= 2;
				}
				else
				{
					a /= 3;
				}
			}
			System.out.println(sum);
		}
	}
}