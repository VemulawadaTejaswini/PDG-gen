import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count[] = new int[N + 1];
		int sum[] = new int[N + 1];
		Arrays.fill(count, 0);
		Arrays.fill(sum, 0);
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			A[i] = tmp;
			count[tmp]++;
		}

		int allSum = 0;
		for (int i = 0; i < N; i++) {
			sum[i] = (count[i] * (count[i] - 1)) / 2;
			allSum += sum[i];
		}

		for (int i = 0; i < N; i++) {
			int tmp = A[i];
			int tmp2 = ((count[tmp] - 1) * ((count[tmp] - 1) - 1)) / 2;
			System.out.println(allSum - sum[tmp] + tmp2);
		}
	}
}