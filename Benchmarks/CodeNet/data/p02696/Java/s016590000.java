import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {


		double A = in.nextLong();
		double B = in.nextLong();
		double N = in.nextLong();

		double x = -1;
		if(N < B) {
			x = N;
		} else {
			x = B-1;
		}

//		for(double a=1;a<N+1;a++) {
//			System.out.println(Math.floor(A*a/B) - (A * Math.floor(a/B)));
//		}
//
//		System.out.println();
//		System.out.println(x);
		System.out.println((long)(Math.floor(A*x/B) - (A * Math.floor(x/B))));
	}

	public static class Obj implements Comparable<Obj>{
		int a;
		int b;
		int c;
		int d;
		@Override
		public int compareTo(Obj o) {
			return Integer.compare(this.a, o.a);
		}

		
	}

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}