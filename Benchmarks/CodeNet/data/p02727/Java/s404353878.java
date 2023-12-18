import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static final Map<Integer, Integer> map = new HashMap<>();


	public static void main(String[] args) {

		int X = in.nextInt();
		int Y = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		long[] p = new long[A];
		long[] q = new long[B];
		long[] r = new long[C];

		long sum = 0L;
		for(int i=0;i<A;i++) {
			p[i] = in.nextLong();
		}

		for(int i=0;i<B;i++) {
			q[i] = in.nextLong();
		}

		for(int i=0;i<C;i++) {
			r[i] = in.nextLong();
		}

		Arrays.sort(p);
		Arrays.sort(q);

		long[] apples = new long[X+Y+C];
		for(int i=0;i<X;i++) {
			apples[i] = p[A-1-i];
		}

		for(int i=X;i<X+Y;i++) {
			apples[i] = q[B-1-i+X];
		}

		for(int i=X+Y;i<X+Y+C;i++) {
			apples[i] = r[C-1-i+X+Y];
		}

		Arrays.sort(apples);
		for(int i=X+Y+C-1; i > C-1; i--) sum += apples[i];
		System.out.println(sum);
	}

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}