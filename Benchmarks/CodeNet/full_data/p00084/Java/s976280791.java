import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String[] input = new Scanner(System.in).nextLine().split("[ .,]");
		
		String output = "";
		int count = 0;
		for(int i=0; i<input.length; i++)
		{
			if(3<=input[i].length() && input[i].length()<=6)
			{
				if(count > 0)
				{
					output += " ";
				}
				output += input[i];
				count ++;
			}
		}
		
		System.out.println(output);
	}
}