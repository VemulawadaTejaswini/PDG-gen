import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int b = a%1000;
		System.out.println(1000-b);
	}
}
