import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int box = 0;
		while(x != 0 || y != 0)
		{
			if(x > y)
			{
				box = x;
				x = y;
				y = box;
			}
			System.out.println(x + " " + y);
			x = scan.nextInt();
			y = scan.nextInt();
		}
	}
}