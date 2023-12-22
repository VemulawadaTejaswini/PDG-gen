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
		int answer = 0;
		for(int b = 1; b < number; b ++)
		{
			answer += a.get(b);
		}

		System.out.print(answer);

	}
}