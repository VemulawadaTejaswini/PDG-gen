import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[][] A = new Integer[N][2];
		for (int i = 0; i < A.length; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = i;
		}
		Arrays.sort(A, (x, y) -> {
			if (x[0].compareTo(y[0]) > 0) {
				return 1;
			} else if (x[0].compareTo(y[0]) < 0) {
				return -1;
			} else {
				return 0;
			}
		});
		StringBuilder sb = new StringBuilder();
		int first = A[A.length - 1][0];
		int second = A[A.length - 2][0];
		for (int i = 0; i < A.length; i++) {
			if (i != A[A.length - 1][1]) {
				sb.append(first);
			} else {
				sb.append(second);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}