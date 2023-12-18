import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		long count = 1;
		for(int i = 1; i <= n-2; i++) {
			long me = arr[i];
			if(arr[i-1] > me && arr[i+1] > me) {
				count++;
				i++;
			} else if(arr[i-1] < me && arr[i+1] < me) {
				count++;
				i++;
			}
		}
		System.out.println(count);
	}
}