import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main
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

		ArrayList <Integer> ordered = new ArrayList <Integer>();

		ordered.add(a.get(number - 1));
		ordered.add(a.get(number - 2));
		answer += a.get(number - 1);
		a.remove(number - 1);
		a.remove(number - 2);
		number -= 2;

		for(int i = 0; i < number; i ++)
		{

			int smallest_of_two = 0;
			int index_of_smallest = 0;
			boolean infront = true;
			for(int j = 0; j < ordered.size(); j ++)
			{
				int temp = 0;
				int temp_index = 0;
				boolean temp_front = true;
				if(j == ordered.size() - 1)
				{
					if(ordered.get(j) > ordered.get(0))
					{
						temp = ordered.get(0);
						temp_index = 0;
						temp_front = false;
					}
					else
					{
						temp = ordered.get(j);
						temp_index = j;
					}
				}
				else
				{
					if(ordered.get(j) > ordered.get(j + 1))
					{
						temp = ordered.get(j + 1);
						temp_index = j + 1;
						temp_front = false;
					}
					else
					{
						temp = ordered.get(j);
						temp_index = j;
					}
				}

				if(temp > smallest_of_two)
				{
					smallest_of_two = temp;
					index_of_smallest = temp_index;
					infront = temp_front;
				}
			}

			answer += smallest_of_two;
			if(infront)
			{
				ordered.add(index_of_smallest + 1, a.get(number - 1 - i));
			}
			else
			{
				ordered.add(index_of_smallest, a.get(number - 1 - i));
			}
		}
		System.out.print(answer);
	}
}