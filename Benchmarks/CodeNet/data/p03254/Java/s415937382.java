
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int x = in.nextInt();
		int count = 0;
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		long sum=x;
		for (int i = 0; i < N; i++) {
			sum = sum - a[i];
			if (sum >= 0) {
				count++;
			}
		}
		if (sum > 0) {
			count--;
		}
		System.out.println(count);

	}
}
