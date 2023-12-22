import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double a1 = (double)a;
		double b1 = (double)b;
		int d = a / b;
		int r = a % b;
		double f = a1 / b1;
		String s = " ";
		System.out.println(d+s+r+s+f);
	}
}