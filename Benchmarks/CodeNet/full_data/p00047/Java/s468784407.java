import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		int[] a = new int[3];
		a[0] = 1;
		a[1] = a[2] = 0;
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			String[] str = stdIn.next().split(",");
			char from = str[0].charAt(0);
			char to = str[1].charAt(0);
			if(from == 'A')
			{
				if(to == 'B')
				{
					int temp = a[0];
					a[0] = a[1];
					a[1] = temp;
				}
				else if(to == 'C')
				{
					int temp = a[0];
					a[0] = a[2];
					a[2] = temp;
				}
			}
			else if(from == 'B')
			{
				if(to == 'A')
				{
					int temp = a[0];
					a[0] = a[1];
					a[1] = temp;
				}
				else if(to == 'C')
				{
					int temp = a[1];
					a[1] = a[2];
					a[2] = temp;
				}
			}
			if(from == 'C')
			{
				if(to == 'A')
				{
					int temp = a[0];
					a[0] = a[2];
					a[2] = temp;
				}
				else if(to == 'B')
				{
					int temp = a[1];
					a[1] = a[2];
					a[2] = temp;
				}
			}
		}
		if(a[0] == 1)
		{
			System.out.println("A");
		}
		else if(a[1] == 1)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
	}
}