import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int d = a / b;
		int r = a % b;
		float f = (float)a / b;
		
		System.out.println(d+" "+r+" "+f);
	}
}