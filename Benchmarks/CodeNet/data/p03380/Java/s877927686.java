import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = reader.nextInt();
		}
		Arrays.sort(A);
		int base = A[N-1];
		int max = 0;
		int ans = 0;
		for (int i = 0; i < N - 1; i++) {
			if (A[i] > 0) {
				int a = getSum(base, A[i]);
				int b = getSum(A[i], A[i]);
				if (a > 0 && b > 0) {
					int tmp =  a /  b;
					if (tmp > max) {
						max = tmp;
						ans = i;
					}
				}

			}
		}
		System.out.println(base + " " + A[ans]);
		reader.close();
	}
	public static int getSum(int base, int count) {
		int sum = 1;
		while (count > 0) {
			sum *= base;
			base--;
			count--;
		}
		return sum;
	}
}

