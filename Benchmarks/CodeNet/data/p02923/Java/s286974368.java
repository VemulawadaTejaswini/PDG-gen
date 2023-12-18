import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		int count;
		int max = 0;

		for (int i = 0; i < N - 1; i++) {
			count = 0;
			for (int j = i + 1; j < N && H[j - 1] >= H[j]; j++) {
					count++;
					max = Math.max(max, count);
			}
		}
		System.out.println(max);
	}
}