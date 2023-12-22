import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println( Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)));
		input.close();
	}
}