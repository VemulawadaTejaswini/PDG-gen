import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double a1 = 1.0D * (double)a;
		double b1 = 1.0D * (double)b;
		int d = a / b;
		int r = a % b;
		double f = 1.0D * a1 / b1;
		String s = " ";
		System.out.println(d + s + r + s + f);
	}
}