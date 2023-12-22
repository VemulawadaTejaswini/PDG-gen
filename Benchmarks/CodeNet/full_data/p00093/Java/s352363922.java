import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		boolean firstFlag = true;
		while(stdIn.hasNext())
		{
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			if(a == 0 && b == 0)
			{
				break;
			}
			if(!firstFlag)
			{
				System.out.println("");
			}
			boolean existFlag = false;
			for(int i = a; i <= b; ++i)
			{
				if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
				{
					System.out.println(i);
					existFlag = true;
				}
			}
			if(!existFlag)
			{
				System.out.println("NA");
			}
			firstFlag = false;
		}
	}
}