
import java.util.Arrays;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] H = new long[N];
		long min =Long.MAX_VALUE;

		for (int i = 0; i < H.length; i++) {
			H[i] = sc.nextLong();
		}

		Arrays.sort(H);

		for (int i = K-1; i < H.length; i++) {
		 	long let = H[i] - H[i - K + 1];
			min = Math.min(min, let);
		}

		System.out.println(min);


	}
}
