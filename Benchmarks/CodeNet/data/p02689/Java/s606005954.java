import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int H[] = new int[N+1];
		for (int i = 1; i < N+1; i++) {
			H[i] = sc.nextInt();
		}
		
		int michi[][] = new int[N+1][N+1];
		for (int i = 0; i < M; i++) {
			int N1 = sc.nextInt();
			int N2 = sc.nextInt();
			michi[N1][N2] = 1;
			michi[N2][N1] = 1;
		}
		
		int count = 0;
		for (int i = 1; i < N+1; i++) {
			int height = H[i];
			boolean result = true;
			for (int j = 1; j < N+1; j++) {
				if (i == j) {
					continue;
				}
				if (michi[i][j] == 0) {
					continue;
				}
				if (height <= H[j]) {
					result = false;
				}
			}
			
			if (result) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
