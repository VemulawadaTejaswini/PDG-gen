
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main
{
	private static Scanner scan = new Scanner(System.in);

	public static void out(int num)
	{
		System.out.println(num);
	}

	public static void main(String[] args)
	{

		int n = scan.nextInt();
		String str = scan.next();
		int min = n;
		int haf = (int) ((n / 2.0) + 0.5);

		for (int i = 1; i <= haf; i++)
		{
			String cut1 = str.substring(0, i);
			String cut2 = str.substring(i);

			List<String> has1 = new ArrayList<>();
			for (int j = 0; j < cut1.length(); j++)
			{
				has1.add((String.valueOf(cut1.charAt(j))));
			}

			has1.sort(Comparator.naturalOrder());
//			System.out.println(has1.toString());

			List<String> has2 = new ArrayList<>();
			for (int j = 0; j < cut2.length(); j++)
			{
				has2.add((String.valueOf(cut2.charAt(j))));
			}
			has2.sort(Comparator.naturalOrder());

//            System.out.println(Arrays.toString(has1.toArray()));
//            System.out.println(Arrays.toString(has2.toArray()));

			//has1 is all 'E'
			//has2 is all 'W'
			int ind1 = ((has1.size() - has1.indexOf("W")));
			int ind2 = has2.indexOf("W");

			if (ind1 > has1.size())
			{
				ind1 = 0;
			}
			if (ind2 == (-1))
			{
				ind2 = 0;
			}
			int temp = ind1 + ind2;
			if (min > temp)
			{
				min = temp;
			}

		}
		out(min);
	}
}
