import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(Gcd(in.nextInt(), in.nextInt()));
	}
	public static int Gcd(int x,int y )
	{
		if(y == 0)
		{
			return x;
		}else if(x == 0)
		{
			return y;
		}else
		{
			if(x > y)
			{
				return Gcd(x % y, y);
			}else
			{
				return Gcd(x, y % x);
			}
		}
	}
}

