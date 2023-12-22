import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		
		System.out.format("%.5f %.5f", Math.PI*r*r, 2*Math.PI*r);
	}
}