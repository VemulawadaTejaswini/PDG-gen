import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		canner scan = new Scanner(System.in);
		String line = scan.next();
		int x = Integer.parseInt(line);
		x = x*x*x;
		System.out.println(x);
	}
}