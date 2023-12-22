import java.util.*;

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
		
		place(a, number);

	}

	public static void place(ArrayList<Integer> a, int number)
	{
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
			int number_add = a.get(number - 1 - i);

			//System.out.println(number_add);

			int smallest_of_two = 0;
			int index_of_smallest = 0;
			boolean infront = true;
			for(int j = 0; j < ordered.size(); j ++)
			{
				int one;
				int two;
				if(j == (ordered.size() - 1))
				{
					one = ordered.get(j);
					two = ordered.get(0);
				}
				else
				{
					one = ordered.get(j);
					two = ordered.get(j + 1);
				}

				int temp = 0;
				int temp_index = 0;
				boolean temp_front = true;

				if(one > two)
				{
					temp = two;
					temp_index = j + 1;
					temp_front = false;
				}
				else
				{
					temp = one;
					temp_index = j;
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
				ordered.add(index_of_smallest + 1, number_add);
			}
			else
			{
				ordered.add(index_of_smallest, number_add);
			}
		}
		//System.out.println(ordered);
		System.out.print(answer);
	}
}