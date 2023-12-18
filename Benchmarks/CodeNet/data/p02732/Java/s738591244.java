import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		long all=0;
		Map<Integer,Integer> map = new HashMap<>();
		int N = in.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = in.nextInt();
			int a = map.getOrDefault(A[i], -1) + 1;
			all+=a;
			map.put(A[i], a);
		}

		for(int a: A) {
			System.out.println(all - map.get(a));
		}
	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}