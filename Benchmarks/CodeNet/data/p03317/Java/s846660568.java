import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int []A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		scan.close();
		if(K == N) {
			System.out.println(1);
		}else {
			if(K == 2) {
				System.out.println(N - 1);
			}else {
				if(N % (K - 1) == 0) {
					System.out.println(N / (K - 1));
				}else {
					System.out.println(N / (K - 1) + 1);
				}
			}
		}
	}
}