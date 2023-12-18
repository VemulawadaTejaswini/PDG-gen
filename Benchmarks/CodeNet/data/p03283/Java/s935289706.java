import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		
		int[][] trainDiv = new int[M][2];
		int[][] cityDiv = new int[Q][2];
		
		for (int i = 0; i < M; i++) {
			trainDiv[i][0] = sc.nextInt();
			trainDiv[i][1] = sc.nextInt();
		}
		
		for (int i = 0; i < Q; i++) {
			cityDiv[i][0] = sc.nextInt();
			cityDiv[i][1] = sc.nextInt();
		}
		
		int count;
		for (int i = 0; i < Q; i++) {
			count = 0;
			for (int j = 0; j < M; j++) {
				if (trainDiv[j][0] >= cityDiv[i][0] &&trainDiv[j][1] <= cityDiv[i][1]) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		sc.close();
		
	}
}