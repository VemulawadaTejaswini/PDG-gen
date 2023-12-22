import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] cards = new int[3][N];
		int[] score = new int[N];
		for(int i = 0; i < N; i++) for(int j = 0; j < 3; j++) {
			cards[j][i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					if(j !=k && cards[i][j] == cards[i][k]) break;
					else if(k == N-1) score[j] += cards[i][j];
				}
			}
		}
		for(int i = 0; i < N; i++) System.out.println(score[i]);
	}
}