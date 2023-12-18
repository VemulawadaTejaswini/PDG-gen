
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		if(K == 0) {
			System.out.println("Yes");
			return;
		}
		for(int i = 0 ; i <= N ; i ++) {
			for(int j = 0 ; j <= M ; j ++) {
				if(K == i * N + j * M) {
					System.out.println("Yes");
					return;
				}
				if(N >= M) {
					if(K == i * N + j * M - i * 2) {
						System.out.println("Yes");
						return;
					}
				} else {
					if(K == i * N + j * M - j * 2) {
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");
	}
}