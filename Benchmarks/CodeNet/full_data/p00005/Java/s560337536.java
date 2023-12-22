import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,g,l;
		while(sc.hasNext())
		{
			a = sc.nextInt();
			b = sc.nextInt();
			g = gcd(a,b);
			l = (a*b)/g;
			System.out.printf("%d %d\n",g,l);
		}
	}

	private static int gcd(int a, int b) {
		if(a==0) return b;
		else if(b==0) return a;
		return gcd(b,a%b);
	}
}