import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[M];
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}
		int costU = 0;
		int costD = 0;
		int count = 1;
		for (int i = 0; i <= N; i++) {
			if (i != 0 && i != X && i != N) {
				if (i == A[count] && i < X) {
					costD++;
					count++;
				} else if (i == A[count] && i > X) {
					costU++;
					count++;
				}
			}
		}
		if (costU > costD) {
			System.out.println(costD);
		} else {
			System.out.println(costU);
		}
	}
}