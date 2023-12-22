import java.util.Scanner;

class Main
{
	public static void main(int x)
	{
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		x = Math.pow(x, 3);
		System.out.println(x);
	}
}