import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		int n, m;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		m = input.nextInt();
		System.out.println(n*m + " " + 2*(n+m));
	}
}