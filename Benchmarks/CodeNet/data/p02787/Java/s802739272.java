import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] DP = new int[H+10001];
		for(int i = 0;i < N;i++){
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		sc.close();

		for(int i = 1;i < H+1;i++){
			int cnt = i + 10000;
			DP[cnt] = Integer.MAX_VALUE;
			for(int j = 0;j < N;j++){
				DP[cnt] = Math.min(DP[cnt], DP[cnt - A[j]] + B[j]);
			}
		}
		System.out.println(DP[H+10000]);
	}
}