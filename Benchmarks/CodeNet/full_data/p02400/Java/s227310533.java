import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.printf("%f %f\n", Math.PI * a * a, 2 * Math.PI * a);
		sc.close();
	}
}
