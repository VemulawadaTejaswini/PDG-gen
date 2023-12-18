import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int check = 1;
		for(int i=2; i<10; i++)
		{
			int f = n%i;
			if(f == 0)
			{
				int a = n/i;
				if(a > 0 && a < 10)
				{
					check = 2;
					System.out.println("Yes");
					return;
				}
			}
			if(i == 9 && check == 1)
				System.out.println("No");
		}
	}
}