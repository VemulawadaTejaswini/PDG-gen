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
			int lcm = a * b / gcd;
			
			System.out.println(gcd + " " + lcm);
		}
	}
	
	public static int GCD(int a, int b)
	{
		if (b != 0){
			return (GCD(b, a % b));
		}
		else {
			return (b);
		}
	}
}