import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			String[] array = scanner.nextLine().split(" ");
			List<String> list = new ArrayList<>(Arrays.asList(array));

			for(int i=0; i<list.size(); i++)
			{
				if(!isNumber(list.get(i)))
				{
					double n = calc(list.get(i-2), list.get(i-1), list.get(i));
					list.set(i-2, String.valueOf(n));
					list.remove(i);
					list.remove(i-1);
					i = 0;
				}
			}
					
			System.out.printf("%1$.6f\n", Double.parseDouble(list.get(0)));	
		}
	}
	
	static boolean isNumber(String value)
	{
		try
		{
			Double.parseDouble(value);
			return true;
		}
		catch (NumberFormatException nfex) 
		{
			return false;
		}
	}
	
	static double calc(String str0, String str1, String sign)
	{
		double n = Double.parseDouble(str0);
		double m = Double.parseDouble(str1);
		switch(sign)
		{
			case "+":
				return n + m;
			case "-":
				return n - m;
			case "*":
				return n * m;
			case "/":
				return n / m;
		}
		
		return 0;
	}
}