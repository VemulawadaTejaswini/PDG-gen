

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		int c = gcd(a,b);
		List<Integer> result = primeFactorization(c);
		System.out.println(result.size());
	}
	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	private static List<Integer> primeFactorization(int y) {
		List<Integer> result = new ArrayList<Integer>();
		while(y % 2 == 0) {
			result.add(2);
		    y /= 2;
		}

		int i = 3;
		while(y != 1) {
		    if(y % i == 0) {
				result.add(i);
		           y /= i;
		    }
		    else {
		           i+=2;
		    }
		}
		return result;
	}
}
