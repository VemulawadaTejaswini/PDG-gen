import java.util.*;
import java.math.*;

public class Main {
	public static void main(String ards[])
	{
		Scanner cin = new Scanner(System.in);
		double a = cin.nextDouble();
		double b = cin.nextDouble();
		double c = cin.nextDouble();
		
		double x = Math.sqrt(a*b);
		if(2*x < c-a-b) System.out.println("Yes");
		else System.out.println("No");
	}
}