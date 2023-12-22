import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{
			String in = scanner.next();
			//String out = "";
			if(in.equals("0"))
			{
				break;
			}
			
			int sum = 0;
			for(int i=0; i<in.length(); i++)
			{
				char c = in.charAt(i);
				sum += c - '0';
			}
			
			System.out.println(sum+"");
		}
	}
}