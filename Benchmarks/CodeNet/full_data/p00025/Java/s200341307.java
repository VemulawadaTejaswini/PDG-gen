import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int[] a = new int[4];
			int[] b = new int[4];
			for(int i = 0; i < 4; ++i)
			{
				a[i] = stdIn.nextInt();
			}
			for(int i = 0; i < 4; ++i)
			{
				b[i] = stdIn.nextInt();
			}
			int Hit = 0;
			int Blow = 0;
			for(int i = 0; i < 4; ++i)
			{
				for(int j = 0; j < 4; ++j)
				{
					if(a[i] == b[j])
					{
						if(i == j)
						{
							++Hit;
						}
						else
						{
							++Blow;
						}
					}
				}
			}
			System.out.printf("%d %d\n", Hit, Blow);
		}
	}
}