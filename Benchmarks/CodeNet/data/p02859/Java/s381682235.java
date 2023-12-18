import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		DecimalFormat df = new DecimalFormat("#,###.##");

		int r = sc.nextInt(), num;

		num = (int)((Math.pow(r,2))/(1));

		System.out.println(num);
	}
}