import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main
{

	public static void main(String[] args)
	{
		// TODO ?????????????????????????????????????????????
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> lstInt = new ArrayList<Integer>();

		for (; scanner.hasNext();)
		{
			lstInt.add(scanner.nextInt());
			
			if (lstInt.size() == 10)
			{
				Collections.sort(lstInt);

				for (int i = 0; i < 3; ++i)
					System.out.println(lstInt.get(i));
			}
			lstInt.clear();
		}

		scanner.close();
	}

}