import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long N = Long.parseLong(sc.next());
		long max = -1;
		long maxX = N;
		long minX = 0;
		long bb = 1;
		while(true) {
			// 割って切り捨てが発生するので、二分探索では細かく性格には求められないかも
			long a = (A * bb /B) - A * (bb/B);
			if(a > max) {
				max = a;
				minX = bb;
			} else if(a == max) {
				break;
			} else {
				maxX = bb;
			}
			bb = (maxX + minX )/2;
		}
		long b  = 0;
		for(long i=bb;i<=maxX;i++) {
			long a = (A * i /B) - A * (i/B);
			b = Math.max(a, b);
		}
		System.out.println(b);
	}
}
