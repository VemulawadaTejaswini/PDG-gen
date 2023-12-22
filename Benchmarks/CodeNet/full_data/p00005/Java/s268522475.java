import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a, b;
		
		Scanner cin = new Scanner (System.in);
		while (cin.hasNext()) {
			a = cin.nextInt();
			b = cin.nextInt();
			
			gcdlcm(a, b, 0);
			gcdlcm(a, b, 1);
		}
	}
	
	private static void gcdlcm (int x, int y, int glf) {
		boolean f = true;
		int z = 0, ans = 1;
		while (f) {
			f = false;
			if (x >= y) z = x;
			if (y > x) z = y;
			for (int i = 2; i < z; i++) {
				if (x % i == 0 && y % i == 0) {
					x /= i; y /= i;
					ans *= i;
					f = true;
				}
			}

			if (f == false) { 
				if (glf == 1) ans *= x * y;
				System.out.println(ans);
			}
		}
	}
	
	
	
}