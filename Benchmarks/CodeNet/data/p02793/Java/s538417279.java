import java.util.Scanner;
public class Main {
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c/b);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		long[] a = new long[N];
		for(int i=0 ; i<N ; i++) {
			a[i] = stdIn.nextLong();
		}
		long x=a[0] ;
		for(int i=1 ; i<N ;i++) {
			x = lcm(x,a[i]);
		}
				long sum = 0;
		for(int i=0; i<N ; i++) {
			sum += (x/a[i]);
		}
		System.out.println(sum%(1000000000+7));
	}
}
