import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int count = N + X;
		for (int i = 0; i < N; i++) {
			count += D / A[i];
			if (D % A[i] == 0) {
				count--;
			}
		}
		System.out.println(count);
	}
}