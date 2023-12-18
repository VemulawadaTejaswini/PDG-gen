import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
		
		System.out.println(question2(n, input));
	}
	
	public static int question2(int n, String input)
	{
		int count = 0;
		int value;
		String key;
		Hashtable<String, Integer> table = new Hashtable<String, Integer>();
		Scanner scan = new Scanner(input);
		
		for(int i = 1; i <= n; i++)
		{
			value = scan.nextInt();
			table.put(i+"", value);
		}
		
		Set keys = table.keySet();
		Iterator<String> itr = keys.iterator();
		Iterator<String> itr1;
		int key1, value1, key2, value2;
		
		while (itr.hasNext())
		{
			key = itr.next();
			key1 = Integer.parseInt(key);
			value1 = table.get(key);
			
			itr1 = keys.iterator();
			while (itr1.hasNext())
			{
				key = itr1.next();
				key2 = Integer.parseInt(key);
				value2 = table.get(key);
				
				if(compareValues(key1, value1, key2, value2) == true)
				{
					count++;
				}
			}
		}
		
		return count/2;
	}
	
	private static boolean compareValues(int key1, int value1, int key2, int value2)
	{
		if(key1 == value2 && value1 == key2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}