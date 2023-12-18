import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		String[] values = sc.nextLine().split(" ");
		int[] A = Arrays.stream(values).mapToInt(s -> Integer.parseInt(s)).toArray();
		values = sc.nextLine().split(" ");
		int[] B = Arrays.stream(values).mapToInt(s -> Integer.parseInt(s)).toArray();
		long cnt = 0;
		for (int i = 0; i < N; i++) {
			int thisTown = Math.min(A[i], B[i]);
			cnt += thisTown;
			A[i] -= thisTown;
			B[i] -= thisTown;
			int nextTown = Math.min(A[i + 1], B[i]);
			cnt += nextTown;
			A[i + 1] -= nextTown;
			B[i] -= nextTown;
		}
		System.out.println(cnt);
	}
}