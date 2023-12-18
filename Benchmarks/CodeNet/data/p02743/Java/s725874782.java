import java.util.*;
import java.math.*;

public class Main {
	public static int x, maxn, d;
	public static void main(String ards[])
	{
		Scanner cin = new Scanner(System.in);
		double a = cin.nextDouble();
		double b = cin.nextDouble();
		double c = cin.nextDouble();
		
		double x = Math.sqrt(a*b);
		if(a+b+2*x < c) System.out.println("Yes");
		else System.out.println("No");
	}
}