import java.util.Arrays;
import java.util.Scanner;

public class Main
{

	public static void main( String[] args )
	{

		Scanner s = new Scanner( System.in );

		int n = s.nextInt();
		int[] strengths = new int[3*n];
		
		for(int i = 0; i < 3*n; i++)
		{
			strengths[i] = s.nextInt();
		}
		
		Arrays.sort( strengths );
		
		int l = 0, r = 3*n - 1;
		long sum = 0;
		while(l < r)
		{
			sum += strengths[r-1];
			r -= 2;
			l++;
		}

		System.out.println( sum );
		
		s.close();

	}

}
