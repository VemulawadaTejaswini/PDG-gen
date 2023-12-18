import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	List<Integer> list = new ArrayList<Integer>();

	int n = scanner.nextInt();
	int m = scanner.nextInt();

	int sumVotes = 0;

	for (int i = 0; i < n; i++)
	{
	    list.add(scanner.nextInt());
	    sumVotes = sumVotes + list.get(i);
	}
	scanner.close();

	double minimum = (sumVotes * (1.0 / (m * 4)));
	int count = 0;

	for (Integer integer : list)
	{
	    if ((double) integer >= minimum)
	    {
		count++;
	    }
	}
	System.out.println(count >= m ? "Yes" : "No");
    }
}