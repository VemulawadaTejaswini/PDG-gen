import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N + 2];
		A[0] = 0;
		A[N + 1] = 0;
		int temp = 0;
		for (int i = 0; i < N; i++) {
			A[i + 1] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int a[] = A.clone();
			temp = 0;
			for (int j = 0; j < N + 1; j++) {
				if (i == j) {
					a[j+1] = a[j];
				}
				temp += Math.abs(a[j+1] - a[j]);
			}
			System.out.println(temp);
		}
	}
}