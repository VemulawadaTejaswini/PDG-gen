import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i%10==3 || i%3==0)
			{
				System.out.print(" ");
				System.out.print(i);
			}
		}
		System.out.println("");
	}
}