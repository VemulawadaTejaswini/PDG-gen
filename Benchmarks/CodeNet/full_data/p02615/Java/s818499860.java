import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class test
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		int number = console.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for(int i = 0; i < number; i ++)
		{
			a.add(console.nextInt());
		}

		// sort
		Collections.sort(a);
		//list is in order.
		
		int answer = 0;
		answer += a.get(number - 1);

		for(int i = 0; i < number - 1; i ++)
		{
			answer = answer + (a.get(number - 2 - (i / 2)));
		}
		System.out.print(answer);
	}
}
