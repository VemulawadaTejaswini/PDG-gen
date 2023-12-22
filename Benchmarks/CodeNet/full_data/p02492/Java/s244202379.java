import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		int flag =1;
		do
		{
			Scanner scan= new Scanner(System.in);
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();
			scan.close();
			switch(op)
			{
				case "+":
				System.out.println(a+b);
				break;
				case "-":
					System.out.println(a-b);
					break;
				case "*":
					System.out.println(a*b);
					break;
				case "/":
					System.out.println(a/b);
					break;
				break;
			}
		}while(flag>0);

	}
}