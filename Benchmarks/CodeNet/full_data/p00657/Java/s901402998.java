import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int r = stdIn.nextInt();
			int c = stdIn.nextInt();
			if(r == 0 && c == 0)
			{
				break;
			}
			if((r * c) % 2 == 0)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}