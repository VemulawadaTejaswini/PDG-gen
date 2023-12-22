import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		for(int i=1;; i++)
		{		
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if(a==0 && b==0)
			{
				break;
			}
			else if(a > b)
			{
				int buf = a;
				a = b;
				b = buf;
				
			}
			System.out.println(a+" "+b);
		}
	}
}