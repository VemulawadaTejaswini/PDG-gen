import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = a / b;
		int r = a % b;
		double d1 = 1.0D * a / b;
		float f = (float)d1;
		System.out.println(d + " " + r + " " + f);
	}
}