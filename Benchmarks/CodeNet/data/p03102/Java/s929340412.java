import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), C = sc.nextInt(), sum = 0;
		int[] B = new int[M];
		for (int i = 0; i < M; i++) B[i] = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int[] A = new int[M];
			for (int a = 0; a < M; a++) {
				A[a] = sc.nextInt();
			}
			int count = 0;
			for (int j = 0; j < M; j++) {
//				System.out.println(A[j] + " " + B[j]);
				count += A[j]*B[j];
			}
			if (count+C > 0) sum++;
		}
		System.out.println(sum);
	}

}