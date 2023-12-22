import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int player = sc.nextInt();
		int[][] n = new int[player][3];
		int[][] flag = new int[player][3];
		int[] score = new int[player];
		for(int i = 0;i < player;i++){
			for(int j = 0;j < 3;j++){
				n[i][j] = sc.nextInt();
				for(int k = 0;k <i; k++){
					flag[i][j] = 1;
					if(n[i][j] == n[k][j]){
						flag[i][j] = 0;
						flag[k][j] = 0;
						break;
					}
				}
			}
		}
		for(int i = 0;i < player;i++){
			for(int j = 0;j < 3;j++){
				score[i] += n[i][j]* flag[i][j];
			}
			System.out.println(score[i]);
		}
	}
}