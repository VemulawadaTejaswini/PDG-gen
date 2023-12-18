import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int i;
	static long []A;
	static long []B;
	static long []C;
	static long []D;
	static StringBuilder sb;
	// 在庫
	static long a;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		A = new long[T];
		B = new long[T];
		C = new long[T];
		D = new long[T];

		for(i = 0; i < T; i++) {
			A[i] = scan.nextLong();
			B[i] = scan.nextLong();
			C[i] = scan.nextLong();
			D[i] = scan.nextLong();
		}
		scan.close();
		sb = new StringBuilder();
		for(i = 0; i < T; i++) {
			a = A[i] - B[i];
			if(a < 0 || D[i] < B[i]) {
				sb.append("No").append("\n");
			}else if(C[i] >= B[i]){
				sb.append("Yes").append("\n");
			}else {
				// C > B, A > B, D > B, a > 0
				Set<Long> map = new HashSet<Long>();
				map.add(a);
				int cnt = 0;
				while(true) {
					if(isA()) {
						break;
					}
					if(a <= C[i]) {
						if(map.contains(a)) {
							cnt ++;
							if(cnt >= 2) {
								sb.append("Yes").append("\n");
								break;
							}
						}else {
							map.add(a);
						}
					}
					add();
					a -= B[i];
					if(isA()) {
						break;
					}
					while(a > C[i]) {
						long l = a - C[i];
						long k = l / B[i];
						if(k == 0) {
							a -= B[i];
						}else {
							a -= k * B[i];
						}
					}
				}
			}

		}
		System.out.println(sb.toString());

	}
	// 在庫を補充
	static void add() {
		if(a <= C[i]) {
			a += D[i];
		}
	}
	static boolean isA() {
		if(a < 0) {
			sb.append("No").append("\n");
			return true;
		}else {
			return false;
		}
	}
}