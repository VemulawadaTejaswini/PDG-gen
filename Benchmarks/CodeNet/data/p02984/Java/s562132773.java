import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] A = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
		int[] Y = new int[N];
		int total = Arrays.stream(A).sum();
		for (int i = 0; i < N; i++) {
			int subTotal = 0;
			for (int j = 0; j < N - 1; j += 2) {
				int idx = (i + j + 1) % N;
				subTotal += A[idx] * 2;
			}
			Y[i] = total - subTotal;
		}
		Arrays.stream(Y).forEach(s -> System.out.print(s + " "));
	}
}