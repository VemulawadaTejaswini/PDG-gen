import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long M = sc.nextLong();
		long K = sc.nextLong();
		long[] A1 = new long[(int)N];
		long[] B1 = new long[(int)M];
		Stack<Long> A = new Stack<Long>();
		Stack<Long> B = new Stack<Long>();
		for (int i = 0; i < N; i++) {
			A1[i] = Integer.parseInt(sc.next());
//			A.push(Integer.parseInt(sc.next()));
		}
		for (int i = 0; i < M; i++) {
			B1[i] = Integer.parseInt(sc.next());
//			B.push(Integer.parseInt(sc.next()));
		}
		for (long i = N-1; i >= 0; i--) {
			A.push(A1[(int) i]);
		}
		for (long i = M-1; i >= 0; i--) {
			B.push(B1[(int) i]);
		}
		int ans = 0;
		boolean flg = true;
		while (flg == true) {
			if (A.isEmpty() == true) {
				if (B.isEmpty() == true) {
					flg = false;
				} else {
					Long b = B.pop();
					if (b > K) {
						flg = false;
					} else {
						K = K - b;
						ans++;
					}
				}
			} else {
				if (B.isEmpty() == true) {
					Long a = A.pop();
					if (a > K) {
						flg = false;
					} else {
						K = K - a;
						ans++;
					}
				} else {
					Long a = A.pop();
					Long b = B.pop();
					if (a > K && b > K) {
						flg = false;
					} else {
						if (a < b) {
							K = K - a;
							ans++;
							B.push(b);
						} else {
							K = K - b;
							ans++;
							A.push(a);
						}
					}
				}
			}
		}
		System.out.println(ans);

	}
}
