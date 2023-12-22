import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Point{
		long x;
		long y;
		Point(long a , long b){
			x = a;
			y = b;
		}
		@Override
		public String toString() {
			return x+ " " +y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long xs[] = new long[N];
		long ys[] = new long[N];

		for(int i = 0 ; i < N ; ++i){
			long a = sc.nextLong();
			long b = sc.nextLong();
			long x = a - b;
			long y = a + b;
			xs[i] = x;
			ys[i] = y;
		}
		Arrays.sort(xs);
		Arrays.sort(ys);
		long xd = xs[N - 1] - xs[0];
		long yd = ys[N - 1] - ys[0];
		System.out.println(Math.max(xd, yd));
	}
}
