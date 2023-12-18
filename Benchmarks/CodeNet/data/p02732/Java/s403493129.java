import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N];
		int[] values = new int[N+1];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			values[a[i]]++;
		}
		sc.close();

		int sum = 0;
		for (int c : values) {
			sum += (c-1)*c/2;
		}

		for (int i = 0; i < N; i++) {
			System.out.println(sum - (values[a[i]]-1));
		}

	}

}
