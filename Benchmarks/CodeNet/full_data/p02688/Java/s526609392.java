import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];

		Arrays.fill(a, -1);


		for (int i = 0; i < k; i++) {
			int count = sc.nextInt();
			for (int j = 0; j < count; j++) {
				a[sc.nextInt() - 1] = 1;
			}
		}

		int answer = 0;
		for (int i : a) {
			if (i == -1) answer++;
		}

		System.out.println(answer);

		sc.close();
	}

}
