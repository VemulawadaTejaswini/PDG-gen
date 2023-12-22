/* package whatever; // don't place package name! */

import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner cin = new Scanner(System.in);
		
		while (cin.hasNext()){
			int a = cin.nextInt();
			int b = cin.nextInt();
			int gcd = GCD(a, b);
			int lcm = a / gcd * b;
			
			System.out.println(gcd + " " + lcm);
		}
	}
	
	private static int GCD(int a, int b)
	{
		if (a % b != 0){
			return (GCD(b, a % b));
		}
		else {
			return (b);
		}
	}
}