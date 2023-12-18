import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		ArrayList<Long> div = new ArrayList<Long>();

		long g = gcd(A, B);
		int count = 1;
		if(g%2==0 && (g/2)%2!=0) {
			count++;
		}
		for(int i = 3; i <= g; i+=2) {
			if(g%i==0 && g/i%i !=0)count++;
		}
		System.out.println(count);
	}
	static long gcd(long n, long m) {
		if(n>m)return gcd(m,n);
		if(n == 0)return m;
		return gcd(n, m%n);
	}
}