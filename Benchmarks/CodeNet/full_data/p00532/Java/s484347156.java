import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] A = new int[M];
		
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}
		
		int[][] B = new int[N][M];
		int[][] point = new int[N][M];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				B[j][i] = sc.nextInt();
				point[j][i] = 0;
			}
		}
		
		int addPoint = 0;
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(A[i] == B[j][i]) {
					point[j][i]++;
				} else {
					addPoint++;
				}
			}
			
			point[A[i] - 1][i]+=addPoint;
			
			addPoint = 0;
		}
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				sum+=point[i][j];
			}
			
			System.out.println(sum);
			
			sum = 0;
		}
		
		
	}
}