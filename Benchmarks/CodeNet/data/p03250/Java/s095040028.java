import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

		if (a > b && a > c)
			System.out.println((a*10)+b+c);
		else if (b > a && b > c)
			System.out.println((b*10)+a+c);
		else
			System.out.println((c*10)+b+a);
	}
}