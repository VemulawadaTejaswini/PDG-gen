import java.util.Scanner;

public class Main
{
	public static void main(String[]  args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.nextLine();
		for(; n>0; n--)
		{
			String[] input = scanner.nextLine().split(" ");
			
			String output = "";
			for(int i=0; i<input.length; i++)
			{
				if(input[i].length() > 6)
				{
					if(input[i].substring(0,7).equals("Hoshino"))
					{
						input[i] = "Hoshina" + input[i].substring(7);
					}
				}
				
				output += (i>0?" ":"") + input[i];
			}
			System.out.println(output);
		}
	}
}