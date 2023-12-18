import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static long gcd(long a, long b) {
		while (b != 0) {
			long t = b;
			b = a % b;
			a = t;
		}
		
		return a;
	}
	
	public static long lcm(long a, long b) {
		long denom = gcd(a,b);
		long numer = a * b;
		return numer / denom;
	}
	
	public static long lcmm(ArrayList<Long> clocks, int n) {
		if (n == 2) {
			return lcm(clocks.get(0),clocks.get(1));
		} else {
			long argument = clocks.get(0);
			clocks.remove(0);
			return lcm(argument, lcmm(clocks, n-1));
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Long> clocks = new ArrayList<Long>();
		
		for (int i = 0; i < n; i++) {
			clocks.add(sc.nextLong());
		}
		
		// now we compute the LCM of all of the clocks elements, we do so using the Euclidean algorithm
		System.out.println(lcmm(clocks, n));
		
		sc.close();
	}

}
