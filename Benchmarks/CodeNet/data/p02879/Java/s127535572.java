
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		//variables
		int num1, num2, product;

		//scanner
		Scanner sc = new Scanner(System.in);

		//user input
		System.out.println("type first number");
		num1 = sc.nextInt();

		System.out.println("type second number");
		num2 = sc.nextInt();

		//calc
		product = num1*num2;

		//deciding output
		System.out.println("");
		if(((num1 < 9) && (num1 >=1)&&((num2 < 9) && (num2 >=1))))
		{
			System.out.println(num1+ "\t"+num2);
			System.out.println(product);
		}
		else

			System.out.println("-1");




	}
}