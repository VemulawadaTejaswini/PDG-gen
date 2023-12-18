import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] D = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}D[0] = A[0]-A[N-1];
		for(int j=1; j<N; j++) {
			D[j] = A[j]-A[j-1];
		}Arrays.sort(D);

		System.out.println(D[N-1]);

	}

}
