import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		
		long r = (a/b);
//		for( long i=1 ; i<=n ; i++ ) {
//			long re = calc(a, b, i);
//			if( re > r ) r = re;
//		}
		
		long m = Math.min(b-1,n);
		System.out.println( calc(a,b,m));
	}

	private long calc(long a, long b, long i) {
		return (a*i/b) - a * (i/b);
	}
}
