import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();

		long x = n;

		long g1 = a*x/b;
		long g2 = x/b;
		long g = g1 - a*g2;

		while ( x/b==n/b && x>0 && x/b>0 ) {
			x = x - x%b -1l;
		}

		g1 = a*x/b;
		g2 = x/b;
		g = Math.max(g, g1 - a*g2);

		System.out.println(g);
	}
}