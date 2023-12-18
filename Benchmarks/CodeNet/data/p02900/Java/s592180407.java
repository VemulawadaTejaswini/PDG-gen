import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();

		long g = gcd(A, B);
		int count = 1;
		int i = 2;
		while(g != 1) {
			if(g%i == 0) {
				g/=i;
				if(g%i!=0)count++;
			}else {
				i++;
			}
		}
		System.out.println(count);
	}
	static long gcd(long n, long m) {
		if(n>m)return gcd(m,n);
		if(n == 0)return m;
		return gcd(n, m%n);
	}
}