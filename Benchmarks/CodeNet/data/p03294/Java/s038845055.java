
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt(), f = 0;
		int arr[] = new int[len];
		long lcm = arr[0] = scan.nextInt();
		for (int i = 1; i < len; i++)
		{
			arr[i] = scan.nextInt();
			lcm = lcm(lcm, arr[i]);
		}
		scan.close();
		lcm--;
		
		for (int j = 0; j < len; j++)
		{
			f += lcm % arr[j];
		}
		System.out.println(f);
		
	}
	
	static long gcd(long x, long y)
	{
		long r;
		while((r = x % y) != 0)
		{
			x = y;
			y = r;
		}
		return y;
	}
	
	static long lcm(long x, long y)
	{
		return x * y / gcd(x, y);
	}
	
}
