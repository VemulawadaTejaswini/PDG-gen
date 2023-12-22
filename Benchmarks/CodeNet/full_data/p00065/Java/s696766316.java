import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main
{
	static class Company
	{
		int no;
		int count;
		boolean is_trade;
	};
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Company> comp = new ArrayList<>();
		for(; ;)
		{
			String input = scanner.nextLine();
			if(input.equals(""))
			{
				break;
			}
			String[] word = input.split(",");
			
			boolean is_add = true;
			for(int i=0; i<comp.size(); i++)
			{
				if(comp.get(i).no == Integer.parseInt(word[0]))
				{
					comp.get(i).count++;
					is_add = false;
					break;
				}
			}
			
			if(is_add)
			{
				Company c = new Company();
				c.no = Integer.parseInt(word[0]);
				c.count = 1;
				c.is_trade = false;
				comp.add(c);
			}
		}
		
		Collections.sort(
				comp,
				new Comparator<Company>()
				{
					@Override
					public int compare(Company o1, Company o2)
					{
						return o1.no<o2.no ? -1: 1;
					}
				});
		
		for(; scanner.hasNext();)
		{
			String input = scanner.next();
			String[] word = input.split(",");
			
			for(int i=0; i<comp.size(); i++)
			{
				if(comp.get(i).no == Integer.parseInt(word[0]))
				{
					comp.get(i).count++;
					comp.get(i).is_trade = true;
				}
			}
		}
		
		for(int i=0; i<comp.size(); i++)
		{
			if(comp.get(i).is_trade)
			{
				System.out.println(comp.get(i).no +" "+ comp.get(i).count);
			}
		}
	}
}