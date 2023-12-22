import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long a,b,g,l;
		while(sc.hasNext())
		{
			a = sc.nextLong();
			b = sc.nextLong();
			g = gcd(a,b);
			l = (a*b)/g;
			System.out.println(g + " " + l);
		}
	}

	private static long gcd(long a, long b) {
		if(a==0) return b;
		else if(b==0) return a;
		return gcd(b,a%b);
	}
}