import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		for(int i=1; i<10000; i++)
		{
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			
			if(n == 0)
				break;
			else
				System.out.println("Case "+i+": "+n);
		}
	}
}