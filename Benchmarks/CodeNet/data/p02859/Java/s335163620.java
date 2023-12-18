import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();

		System.out.println((int)(Math.PI * Math.pow(r,2)) /Math.PI * Math.pow(1,2));


	}
}