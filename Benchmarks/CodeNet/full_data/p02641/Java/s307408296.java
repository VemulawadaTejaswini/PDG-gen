import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main
{
	public static void main(String args[]) throws java.lang.Exception,FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);

		// PrintStream obj = new PrintStream(new File("Output.txt"));
		// PrintStream console = System.out;
		// System.setOut(obj);

		int X = sc.nextInt();
		int N = sc.nextInt();

		int min = 0;
		int max = 101;

		int arr[] =  new int[N];

		for(int i = 0;i<N;i++)
		{
			arr[i] = sc.nextInt();
		}

		if(N != 0)
		{
			for(int i = 1;i<=101;i++)
			{
				if(!Arrays.asList(arr).contains(i))
				{
					min = min <= i && i <= X ? i : min;
					max = i <= max && i >= X ? i : max;
				}
			}

			if(Math.abs(min - X) <= Math.abs(max - X))
				System.out.println(min);
			else
				System.out.println(max);
		}

		else
			System.out.println(X);

		System.out.flush();
	}
}