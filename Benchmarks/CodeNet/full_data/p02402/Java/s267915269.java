
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		
		int y = stdIn.nextInt();
		int min = y;
		int max = y;
		long sum = y;
		
		for(int i=1;i<N;i++)
		{
			int x = stdIn.nextInt();
			sum+=x;
			if(min>x)
			{
				min = x;
			}
			else if(max<x)
			{
				max = x;
			}
		}
		
		System.out.println(min+" "+max+" "+sum);
	}

}