import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		int Z = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		long A[] = new long[X];
		long B[] = new long[Y];
		long C[] = new long[Z];
		for(int i = 0; i < X; i++) {
			A[i] = Long.parseLong(sc.next());
		}
		for(int i = 0; i < Y; i++) {
			B[i] = Long.parseLong(sc.next());
		}
		for(int i = 0; i < Z; i++) {
			C[i] = Long.parseLong(sc.next());
		}
		long ans[] = new long[K];
		int cnt = 0;
		for(int i = 0; i < X; i++) {
			for(int j = 0; j < Y; j++) {
				for(int k = 0; k < Z; k++) {
					if(cnt >= K) {
						if(ans[0] < A[i] + B[j] + C[k]) {
							ans[0] = A[i] + B[j] + C[k];
							Arrays.sort(ans);
						}
					} else {
						ans[cnt] = A[i] + B[j] + C[k];
						cnt++;
						if(cnt >= K) {
							Arrays.sort(ans);
						}
					}
				}
			}
		}
		for(int i = K - 1; i >= 0; i--) {
			System.out.println(ans[i]);
		}
	}
}
