import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0;
		int M = 0;
		int B = 0;
		int C = 0;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		M = Integer.parseInt(sc.next());
		int[] A = new int[N];
		int i;
		for (i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		java.util.Arrays.sort(A);
		long sum = 0;
		int j;
		ArrayList<Integer> X = new ArrayList<Integer>();
		for (i = 0; i < M; i++) {
			B = Integer.parseInt(sc.next());
			C = Integer.parseInt(sc.next());
			for (j = 0; j < B; j++) {
				X.add(C);
			}
		}
		int n = 0;
		Collections.sort(X,Collections.reverseOrder());
		for (i = 0; i < X.size();i++) {
			if (n == N)
				break;
			if (A[n] < X.get(i)) {
				A[n] = X.get(i);
				n++;
			} else {
				break;
			}
		}
		for(i=0;i<N;i++){
			sum=sum+A[i];
		}
		System.out.println(sum);
	}
}