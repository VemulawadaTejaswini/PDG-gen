import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n + 1], srt[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			srt[i] = arr[i];
		}
		Arrays.parallelSort(srt);
		for (int i = 1; i <= n; i++) {
			System.out.println(srt[n / 2 + (arr[i] >= srt[n / 2 + 1] ? 0 : 1)]);
		}
	}

}