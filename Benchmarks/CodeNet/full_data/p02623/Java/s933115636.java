import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();

		Queue<Integer> A = new ArrayDeque<>();
		for(int i=0; i<N; i++) {
			A.add(sc.nextInt());
		}

		Queue<Integer> B = new ArrayDeque<>();
		for(int i=0; i<M; i++) {
			B.add(sc.nextInt());
		}

		int ans = 0;
		long time = 0;
		for(int i=0; i<N+M; i++) {
			int A_top = 1000000001;
			int B_top = 1000000001;

			if(A.size() > 0) {
				A_top = A.peek();
			}
			if(B.size() > 0) {
				B_top = B.peek();
			}

			if((A.size() == 0 && B.size() == 0)) {
				break;
			}else if(A_top <= B_top) {
				if(time + A.peek() <= K) {
					time += A.poll();
					ans++;
				}else {
					break;
				}
			}else {
				if(time + B.peek() <= K) {
					time += B.poll();
					ans++;
				}else {
					break;
				}
			}
		}

		System.out.println(ans);
	}


}
