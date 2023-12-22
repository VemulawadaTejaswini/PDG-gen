import java.util.Scanner;

class run
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double b = scan.nextInt() * scan.nextDouble();
		scan.close();
		System.out.println((int)b);
		
		
	}
}