import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		double N = stdIn.nextDouble();
		int count = 0;
		while(N >= 1.0)
		{
			N /= 3;
			++count;
		}
		System.out.println(count);
	}
}