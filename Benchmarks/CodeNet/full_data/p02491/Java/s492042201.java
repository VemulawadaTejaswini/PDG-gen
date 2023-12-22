import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int d = (int)a / (int)b;
		int r = (int)a % (int)b;
		double f = 1.0D * a / b;
		System.out.println(d + " " + r + " " + f);
	}
}