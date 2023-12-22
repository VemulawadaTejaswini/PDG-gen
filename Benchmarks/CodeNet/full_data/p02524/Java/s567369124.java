import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r = scanner.nextInt();
		double s = (a*b*StrictMath.sin(StrictMath.toRadians(r)))/2;
		double l = a+b+StrictMath.sqrt(StrictMath.pow(a, 2.0D)+StrictMath.pow(b, 2.0D)-2*a*b*StrictMath.cos(StrictMath.toRadians(r)));
		double h = b*StrictMath.sin(StrictMath.toRadians(r));
		System.out.println(String.format("%3.8f", s));
		System.out.println(String.format("%3.8f", l));
		System.out.println(String.format("%3.8f", h));
	}
}