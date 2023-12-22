import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; ;)
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				break;
			}
			
			int sum = 0;
			for(int i=1; i<=n; i++)
			{
				if(i%5 == 0)
				{
					int j = i;
					for(; j>0 && (j%5==0); j/=10)
					{
						sum ++;
					}
					if(j == 2)
					{
						sum ++;
					}
				}
			}
			System.out.println(sum);
		}
	}
}