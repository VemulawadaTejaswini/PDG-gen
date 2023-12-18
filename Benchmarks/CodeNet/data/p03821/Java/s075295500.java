import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			sc.nextLine();
			Long A[] = new Long[N];
			Long B[] = new Long[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextLong();
				B[i] = sc.nextLong();
			}
			long cnt = 0;
			for (int i = N - 1; i >= 0; i--) {
				if (B[i] != 1) {
					long div = (A[i] + cnt) % B[i];
					cnt = cnt + (B[i] - div);
				}
			}
			System.out.println(cnt);
		}
	}
}
