import java.util.Scanner;
// import java.io.BufferedReader;s
// import java.io.IOException;
// import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int A[] = new int[N - 1];
		int count[] = new int[N];

		for (int i = 0; i < N - 1; i++) {
			A[i] = sc.nextInt();
		}

		// for (int i = 0; i < N - 1; i++) {
		// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// try {
		// String str = reader.readLine();
		// A[i] = Integer.parseInt(str);
		// reader.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }

		for (int i = 1; i < N + 1; i++) {
			count[i - 1] = 0;
			for (int j = 0; j < N - 1; j++) {
				if (A[j] == i) {
					count[i - 1]++;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(count[i]);
		}
	}
}