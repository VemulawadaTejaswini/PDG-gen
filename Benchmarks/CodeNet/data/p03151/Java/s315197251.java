import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn =  new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		long[] C = new long[N];
		long gap = 0;
		long sum = 0;
		int n = 0;
		for(int i = 0; i < N;i++) {
			long Ai = scn.nextLong();
			A[i] = Ai;
			sum += Ai;
		}
		for(int i = 0;i < N;i++) {
			long Bi = scn.nextLong();
			B[i] = Bi;
			sum -= Bi;
			if(Bi > A[i]) {
				gap += Bi - A[i];
				n++;
			}
			C[i] = A[i] - B[i];
		}
		if(sum >= 0) {
			Arrays.sort(C);
			for(int i = C.length-1;i >=0;i--) {
				if(gap <= 0) {
					break;
				}
				gap -= C[i];
				n++;
			}
		}else {
			n = -1;
		}

		System.out.println(n);
	}
}
