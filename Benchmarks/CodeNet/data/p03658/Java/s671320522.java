import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int K = reader.nextInt();
		int ans = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		for (int i = N-K; i < N; i++) {
			ans += arr[i];
		}


		System.out.println(ans);
		reader.close();

	}
}