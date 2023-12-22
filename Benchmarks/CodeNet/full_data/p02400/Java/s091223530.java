import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.LNEG;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int r = scanner.nextInt();
		double pi = Math.PI;
		System.out.printf("%1$.6f, %2$.6f", pi*r*r, 2*r*pi);
	}
}