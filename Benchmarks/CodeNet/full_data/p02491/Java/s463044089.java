import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int d = (int)(a / b);
		int r = (int)(a % b);
		float f = a / b;
		System.out.println(d + " " + r + " " + f);
	}
}