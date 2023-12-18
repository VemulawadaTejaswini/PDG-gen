import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		Deque<Long> que = new ArrayDeque<Long>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			que.addLast(A[i]);
		}
		sc.close();
		Arrays.sort(A);
		long k = A[0];
		long min = k;
		while(!que.isEmpty()) {
			long t = que.pop();
			if(t % k != 0) {
				k = t % k;
				que.add(t);
			}
		}
		System.out.println(k);
	}
}