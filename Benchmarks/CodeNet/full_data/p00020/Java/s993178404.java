import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext())
		{
			String str = scan.next();
			String upstr = str.toUpperCase();
			System.out.print(upstr+" ");
		}
		System.out.println();
	}

}