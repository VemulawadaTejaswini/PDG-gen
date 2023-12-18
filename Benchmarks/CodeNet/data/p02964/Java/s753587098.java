
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int[] A = new int[N];
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		
		Deque<Integer> queue = new ArrayDeque<>();
 
		for (long k=0; k<K; k++) {
			for (int n=0; n<N; n++) {
				if (queue.contains(A[n])) {
					while (queue.pop() != A[n]);
				}
				else {
					queue.push(A[n]);
				}
			}
			if (queue.isEmpty()) {
				if (K%(k + 1) == 0) {
					break;
				}
				k = K - K%(k + 1) - 1;
			}
		}
		
		String ans = "";
		while (!queue.isEmpty()) {
			ans = queue.pop() + " " + ans;
		}
		System.out.println(ans.substring(0, ans.length() - 1));
	}
}