import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();

		int[] point = new int[N];
		int[] vic = new int[Q];

		for(int i = 0; i < N; i++) {
			point[i] = K;
		}

		for(int i = 0; i < Q; i++) {
			vic[i] = sc.nextInt();
		}

		for(int i: vic) {
			for(int j = 0; j < N; j++) {
				if(j != i - 1) {
					point[j] = point[j] - 1;
				}
			}
		}

		for(int i = 0; i < N; i++) {
			if(point[i] <= 0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}


	}

}