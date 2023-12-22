import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int flg = 0;
		
		do
		{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			
			switch(op.charAt(0))
			{
				case '+':
					System.out.println(a + b);
					break;
				case '-':
					System.out.println(a - b);
					break;
				case '*':
					System.out.println(a * b);
					break;
				case '/':
					System.out.println(a / b);
					break;
				case '?':
					flg++;
					break;
			}
		} while(flg == 0);
	}
}