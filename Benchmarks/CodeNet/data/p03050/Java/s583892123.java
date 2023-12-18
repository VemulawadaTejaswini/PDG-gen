import java.util.*;


class Main {
	static long sum=0L;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		divise(N);
		System.out.println(sum);
	}

	static void divise(long n) {
		for (int i=1;i*i<=n;i++) {
			if (n%i==0) {
//				if(i-1>n/i) {
//					sum+=i;
//				}
				if (i*i!=n) {
					if(n/i-1>i) {
						sum+=n/i-1;
					}
				}
			}
		}
	}
}