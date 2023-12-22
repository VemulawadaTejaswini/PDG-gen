import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		boolean[][] flag = new boolean[4][13];
		for(int i = 0; i < n; ++i)
		{
			String c = stdIn.next();
			int d = stdIn.nextInt();
			if(c.equals("S"))
			{
				flag[0][d - 1] = true;
			}
			else if(c.equals("H"))
			{
				flag[1][d - 1] = true;
			}
			else if(c.equals("C"))
			{
				flag[2][d - 1] = true;
			}
			else if(c.equals("D"))
			{
				flag[3][d - 1] = true;
			}
		}
		for(int i = 0; i < 4; ++i)
		{
			for(int j = 0; j < 13; ++j)
			{
				if(!flag[i][j])
				{
					if(i == 0)
					{
						System.out.println("S " + (j + 1));
					}
					else if(i == 1)
					{
						System.out.println("H " + (j + 1));
					}
					else if(i == 2)
					{
						System.out.println("C " + (j + 1));
					}
					else if(i == 3)
					{
						System.out.println("D " + (j + 1));
					}
				}
			}
		}
	}
}