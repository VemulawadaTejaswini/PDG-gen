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
		int mid = getCloser(base, A);
		System.out.println(base + " " + mid);
		reader.close();
	}
	public static int getCloser(int base, int[] A) {
		int N = A.length;
		double mid = base / 2.0;
		double minGap = A[N-1];
		int ans = 0;
		for (int i = 0; i < N - 1; i++) {
			double gap = Math.abs(mid - A[i]);
			if (gap < minGap) {
				minGap = gap;
				ans = A[i];
			}
		}
		return ans;
	}
}

