import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			int[] count = new int[10];
			while(n-- != 0)
			{
				int num = stdIn.nextInt();
				++count[num];
			}
			for(int i = 0; i < count.length; ++i)
			{
				if(count[i] == 0)
				{
					System.out.println("-");
					continue;
				}
				for(int j = 0; j < count[i]; ++j)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}