import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.nextLine());
			int[] A = new int[N];
			int[] B = Arrays.stream(sc.nextLine().split(" ")).mapToInt(r -> Integer.parseInt(r)).toArray();
			A[0] = B[0];
			for (int i = 1; i < N - 1; i++) {
				A[i] = Math.min(B[i - 1], B[i]);
			}
			A[N - 1] = B[N - 2];
			System.out.println(Arrays.stream(A).sum());
		}
	}
}