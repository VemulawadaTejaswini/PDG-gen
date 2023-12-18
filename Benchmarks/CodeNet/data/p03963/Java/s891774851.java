import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		System.out.println(pow(k-1,n-1)*k);
		sc.close();
	}
	public static long pow(long x, long n) {
	    long sum = 1;
	    while (n > 0) {
	        if ((n & 1) == 1) {
	            sum = sum * x;
	        }
	        x = x*x;
	        n >>= 1;
	    }
	    return sum;
	}
}