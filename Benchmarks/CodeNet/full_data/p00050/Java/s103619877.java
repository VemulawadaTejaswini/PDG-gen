import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String[] apple = {"apple", "APPLE"};
		String[] peach = {"peach", "PEACH"};
		
		String input = scanner.nextLine();
		String[] str = input.split(" ");
		
		String output = "";
		for(int j=0; j<str.length; j++)
		{			
			if(j > 0)
			{
				output += " ";
			}
			
			if(str[j].length() >= 5)
			{
				if(str[j].substring(0, 5).equalsIgnoreCase("apple"))
				{
					for(int i=0; i<5; i++)
					{
						char c = str[j].charAt(i);
						if('a'<=c && c<='z')
						{
							output += peach[0].substring(i, i+1);
						}
						else if('A'<=c && c<='Z')
						{
							output += peach[1].substring(i, i+1);
						}
					}
					if(str[j].length() >= 5)
					{
						output += str[j].substring(5, str[j].length());
					}
				}
				else if(str[j].substring(0, 5).equalsIgnoreCase("peach"))
				{
					for(int i=0; i<5; i++)
					{
						char c = str[j].charAt(i);
						if('a'<=c && c<='z')
						{
							output += apple[0].substring(i, i+1);
						}
						else if('A'<=c && c<='Z')
						{
							output += peach[1].substring(i, i+1);
						}
					}
					if(str[j].length() >= 5)
					{
						output += str[j].substring(5, str[j].length());
					}
				}
				else
				{
					output += str[j];
				}
			}
			else {
				output += str[j];
			}
		}
		
		System.out.println(output);
	}
}