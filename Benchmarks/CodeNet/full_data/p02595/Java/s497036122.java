import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		
		while(n-- > 0)
		{
			if(calculate(sc.nextLong(),sc.nextLong(),d))
				count++;
		}
		System.out.println(count);
	}

	private static boolean calculate(long x,long y, int d) {
		x = x*x;
		y = y*y;
		x += y;
		double sqrt = Math.sqrt(x);
		if(sqrt > d)
			return false;
		return true;
		
	}

}
