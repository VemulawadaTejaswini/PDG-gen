import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int height[] = new int[N];
		for (int i = 0; i < N; i++) {
			height[i] = sc.nextInt();
		}

		int road[][] = new int[M][2];

		for (int i = 0; i < M; i++) {
			for (int c = 0; c < 2; c++) {
				road[i][c] = sc.nextInt();
			}
		}

		int goodnum[] = new int[N];
		//for (int i = 0; i < M; i++) {
			//for (int c = 0; c < 2; c++) {
				//goodnum[road[i][c]-1] = 9;
			//}
		//}

		for (int i = 0; i < M; i++) {
			if(height[road[i][0]-1] <= height[road[i][1]-1]) {
				goodnum[road[i][0]-1]=9;
			}
			if(height[road[i][1]-1] <= height[road[i][0]-1]) {
				goodnum[road[i][1]-1]=9;
			}
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			if(goodnum[i] == 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
