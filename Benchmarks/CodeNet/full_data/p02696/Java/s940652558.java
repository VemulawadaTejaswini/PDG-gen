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
		int count = 0;
		for(long i=bb+1;i<=N;i++) {
			long a = (A * i /B) - A * (i/B);
			if(a < max) {
				break;
			} else {
				if(a == max ) {
					count++;
					if(count >= 1000) break;
				}
				max =a;
			}
		}
		System.out.println(max);
	}
}