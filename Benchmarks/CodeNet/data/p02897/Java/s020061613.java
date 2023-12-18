import java.util.*;
import java.text.*;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int oddNumbers = 0, a = 0;

		int input = sc.nextInt();

		for(int i = 1; i <= input; i++)
		{
			a += 1;
			if(a % 2 == 1)
			{
				oddNumbers += 1;
			}
		}

		double probability = (double)oddNumbers / a;
		System.out.println(probability);
	}
}