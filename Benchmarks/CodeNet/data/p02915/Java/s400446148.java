import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int characters = 3;
		int n = sc.nextInt();

		System.out.print(Math.pow(n,characters));
	}
}