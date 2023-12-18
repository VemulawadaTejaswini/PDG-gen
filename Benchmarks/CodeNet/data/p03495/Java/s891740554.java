import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		int[] num = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			num[A[i]]++;
		}
		Arrays.sort(num);
		int ans = 0;
		for (int i = 0; i < 10 - K; i++) {
			ans += num[i];
		}
		System.out.println(ans);
	}

}