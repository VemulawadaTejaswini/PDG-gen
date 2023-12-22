import java.util.Arrays;
import java.util.Scanner;

/** AOJ_No.1147 ICPC_2007_A */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			/* 審査員数 */
			int n = sc.nextInt();
			if(n == 0) break;
			
			int[] score = new int[n];
			for(int i = 0; i < n; i++) {
				score[i] = sc.nextInt();
			}
			
			int sum = 0;
			Arrays.sort(score);
			/* 最高評価と最低評価は除く合計 */
			for(int i = 1; i < n - 1; i++) {
				sum += score[i];
			}
			
			/* 平均を出力 */
			System.out.println(sum/(n - 2));
		}
	}
}

