import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		Arrays.parallelSort(A);
		long sum =0;
		for (int i=1;i<N;i++) {
			sum +=A[i];
		}
		System.out.println(sum);
	}

}