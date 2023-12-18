/*package whatever //do not write package name here */

import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 == 0)
		{
		    n /= 2;
		    System.out.print(n * n);
		}
		else
		{
		    int a = n / 2;
		    n -= a;
		    System.out.print(n * a);
		}
	}
}