import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long K = sc.nextLong();

		long[] A = new long[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextLong();
		}

		long max = 0;
		for (long i = 0; i < K; i++) {
			long sum = 0;
			for (int j = 0; j < A.length; j++) {
				sum += i ^ A[j];
			}
			if (max < sum) {
				max = sum;
			}
		}

		System.out.println(max);

		sc.close();

	}



}


