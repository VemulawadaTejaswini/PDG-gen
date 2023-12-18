import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long sum = 0;
		long n;
		long num = scan.nextLong();
		for(long a = 1; a<=num; a++) {
			for(long b = 1; b<=num; b++) {
				for(long c = 1; c<=num; c++) {
					if(a>=b) {
						n = gcd(a,b);
					}else {
						n = gcd(b,a);
					}

					if(a>=c) {
						n = gcd(n,c);
					}else {
						n = gcd(c,n);
					}

					sum = sum+n;
				}
			}
		}System.out.println(sum);

	}

	public static long gcd(long x, long y) {
    long tmp;
    while ((tmp = x % y) != 0) {
        x = y;
        y = tmp;
    }

    return y;
}

}
