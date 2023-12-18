import java.util.Scanner;


public class main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//User Input
			System.out.print("Insert an integer to multiply: ");
			int firstNum = sc.nextInt();

			System.out.print("Inset an integer to multiply by the first one: ");
			int secondNum = sc.nextInt();

		//If statement
			if(firstNum <= 9 && secondNum <= 9)
			{
				int product = firstNum * secondNum;
				System.out.println("Takahashi found that product is " + product);
			}
			else
				System.out.println("-1");
	}

}