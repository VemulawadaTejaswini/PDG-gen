import java.util.*;

public class main
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("First number");
	int a = scan.nextInt();

	System.out.println("Second number");
	int b = scan.nextInt();

	if( a >= 1 && a <= 9 && b>= 1 && b <=9)
		System.out.println(a * b);
	else
		System.out.println("-1");


	}


}