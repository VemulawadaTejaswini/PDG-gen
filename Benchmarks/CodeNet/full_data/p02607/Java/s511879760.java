import java.util.Scanner;

// Aising2020_B
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < N; i += 2) {
			if (a[i] % 2 == 1) {
				count++;
			}
		}

		System.out.println(count);
		sc.close();
	}

}
