import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		long n = v.nextLong();
		long k = v.nextLong();
		if (n<k) {
			System.out.println(n);
		}else {
			System.out.println(calc(n,k));
		}
	}
	public static long calc(long n, long k) {
		while(n>0) {
			n = n - k;
		}
		n = -n;
		return n;
	}
}
