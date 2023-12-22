import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] a = new int [50], b = new int [50];
		int c = 0;
		
		Scanner cin = new Scanner (System.in);
		while (cin.hasNext()) {
			a[c] = cin.nextInt();
			b[c] = cin.nextInt();
			gcdlcm(a[c], b[c]);
			c++;
		}
	}
	
	private static void gcdlcm (int x, int y) {
		int z = 0, ans = 1;
		if (x >= y) z = x;
		if (y > x) z = y;
		for (int i = 2; i < z; i++) {
			if (x % i == 0 && y % i == 0) {
				x /= i; y /= i;
				ans *= i;
			}
		}
		 
		System.out.print(ans + " ");
		System.out.println(ans *= x * y);
		
	}
}