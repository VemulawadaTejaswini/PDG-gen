import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> dataset = new ArrayList<Integer>();
		while(sc.hasNextLine())
		{
			String[] splitted = sc.nextLine().split("\\s+");
			dataset.add(Integer.parseInt(splitted[0]) + Integer.parseInt(splitted[1]));
		}
		
		for(int i = 0; i < dataset.size(); ++i)
		{
			System.out.println(DigitOf(dataset.get(i)));
		}
	
	}
	
	public static int DigitOf(Integer num)
	{
		if(num < 10)
		{
			return 1;
		}
		else
		{
			return 1 + DigitOf(num/10);
		}
	}
} 