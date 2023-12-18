import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		ArrayList<Long> list =  new ArrayList<Long>();
		for(int i = 0; i < num; i++) {
			list.add(scanner.nextLong());
		}
		long lcm = lcmnum(list);

		long res = 0;

		for(long j : list) {
			res += (lcm-1) % j;
		}

		System.out.println(res);
	}
	private static long lcmnum(ArrayList<Long> list) {
		long i = list.get(0);
		for(long num : list) {
			i = lcm(i, num);
		}
		return i;
	}

	 private static long gcd(long m, long n) {
	        if(m < n) return gcd(n, m);
	        if(n == 0) return m;
	        return gcd(n, m % n);
	    }

	 private static long lcm(long m, long n) {
	        return m * n / gcd(m, n);
	  }

}