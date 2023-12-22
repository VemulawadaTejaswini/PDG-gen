import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[2]);
		String op = str[1];
		int i;
		
		for (;;)
		{
			if (op == "?")
			{
				break;
			}
			
			if (op == "+")
			{
				i = a + b;
			}
			else if (op == "-")
			{
				i = a - b;
			}
			else if (op == "*")
			{
				i = a * b;
			}
			else if (op == "/")
			{
				i = a / b;
			}
			
			System.out.println(i);
		}
	}
}