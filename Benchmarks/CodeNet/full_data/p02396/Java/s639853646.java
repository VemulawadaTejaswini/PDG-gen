import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int i = 0;
		while(x != 0)
		{
			i++;
			System.out.println("Case " + i + ":" + " " + x);
			x = scan.nextInt();
		}
	}
}