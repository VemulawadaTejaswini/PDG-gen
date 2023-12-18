import java.util.Scanner;

public class Main {

	static int H,W,A,B;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = Integer.parseInt(sc.next());
		W = Integer.parseInt(sc.next());
		A = Integer.parseInt(sc.next());
		B = Integer.parseInt(sc.next());

		int connWidth = W-B;
		int connHeight = H-A;
		long[] b1route = new long[connWidth];
		for(int i = 0; i < b1route.length; i++) {
			b1route[i] = conbination((B+i)+(connHeight-1), Math.min(B+i, connHeight-1));
		}

		long[] b2route = new long[connWidth];
		for(int i = 0; i < b2route.length; i++) {
			b2route[i] = conbination((connWidth-1-i)+(A-1), Math.min(connWidth-1-i, A-1));
		}

		long result = 0;
		for(int i = 0; i < b1route.length; i++) {
			result += b1route[i] * b2route[i];
		}
		result = (long)(result % (Math.pow(10, 9) + 7));

		System.out.println(result);
	}

	public static long conbination(int n, int r) {
		long p = 1;
		for(int i = 1; i <= r; i++) {
			p = p * (n - i + 1) / i;
		}
		return p;
	}

}

