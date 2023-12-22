import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext())
			{
				int n = sc.nextInt();
				int count = 0;
				int result = 0;
				if(n == 1){System.out.println(0);continue;}
					for(int i = 3; i < n+1; i+=2)
					{
						count = 0;
						for(int j = i;j > 0 ;j-=2)
						{
							if(i % j == 0)count++;
						}
						
						if(count == 2)result++;
					}
				System.out.println(result+1);
			}
	}
}