import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		int flag = 1;
		while(flag > 0)
		{
			Scanner scan= new Scanner(System.in);
			int a = scan.nextInt();
			char op = scan.next().charAt(0);
			int b = scan.nextInt();
			
			switch(op)
			{
				case '+':
				System.out.println(a+b);
				break;
				case '-':
					System.out.println(a-b);
					break;
				case '*':
					System.out.println(a*b);
					break;
				case '/':
					System.out.println(a/b);
					break;
				case '?':
					flag = -1;
					break;
			}
		}
	}
}