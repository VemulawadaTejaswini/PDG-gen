import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String[] apple = {"apple", "APPLE"};
		String[] peach = {"peach", "PEACH"};
		
		String input = scanner.nextLine();
		
		String output = "";
		for(int i=0; i<input.length(); i++)
		{	
			if(i <= input.length()-5)
			{
				if(input.substring(i, i+5).equalsIgnoreCase("apple"))
				{
					for(int j=0; j<5; j++)
					{
						char c = input.substring(i, i+5).charAt(j);
						if('a'<=c && c<='z')
						{
							output += peach[0].substring(j, j+1);
						}
						else if('A'<=c && c<='Z')
						{
							output += peach[1].substring(j, j+1);
						}
					}
					i += 4;
				}
				else if(input.substring(i, i+5).equalsIgnoreCase("peach"))
				{
					for(int j=0; j<5; j++)
					{
						char c = input.substring(i, i+5).charAt(j);
						if('a'<=c && c<='z')
						{
							output += apple[0].substring(j, j+1);
						}
						else if('A'<=c && c<='Z')
						{
							output += apple[1].substring(j, j+1);
						}
					}
					i += 4;
				}
				else
				{
					output += input.substring(i, i+1);
				}
			}
			else
			{
				output += input.substring(i, i+1);
			}
		}
		
		System.out.println(output);
	}
}