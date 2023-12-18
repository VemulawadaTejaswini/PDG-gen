import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();
	public static int[][][][] memo;

	public static void main(String[] args) {

		int N = in.nextInt();
		int[] A = new int[101];
		for (int i=0;i<N;i++) {
			int Xi = in.nextInt();
			for(int P=1;P<=100;P++) {
				A[P] += Math.pow(Xi - P, 2);
			}
		}

		int value = Integer.MAX_VALUE;
		for(int P=1;P<=100;P++) {
			if (A[P] < value) {
				value = A[P];
			}
		}

		System.out.println(value);

	}


	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}