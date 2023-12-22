import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == -1)
			{
				break;
			}
			if(n == 0)
			{
				System.out.println("0");
				continue;
			}
			String fourDigits = "";
			while(n != 0)
			{
				fourDigits += Integer.toString(n % 4);
				n /= 4;
			}
			System.out.println(fourDigits);
		}
	}
}