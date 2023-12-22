import java.util.Scanner;

public class SimpleCalculator
{
	public static void main(String[] args)
	{
		int flg = 1, a, b;
		do
		{
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			String op = sc.next();
			b = sc.nextInt();
			
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
					flg--;
					break;
			}
		} while(flg > 0);
	}
}