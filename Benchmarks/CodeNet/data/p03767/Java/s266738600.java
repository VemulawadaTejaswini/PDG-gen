import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[3*n];
		for(int i = 0; i < 3*n; i++) {
			arr[i] = sc.nextLong();
		}
		Arrays.sort(arr);
		long count = 0L;
		for(int i = 0, k = n; i < n; i++,k++) {
			count += arr[k];
			k++;
		}
		System.out.println(count);
	}
}
