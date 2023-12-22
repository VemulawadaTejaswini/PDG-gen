
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int i, k;
		int n = sc.nextInt();
		int[][] score = new int [n][3];
		int[][] score1 = new int [n][3];
		int[] sum = new int [5];
		for(i = 0; i < n; i++){
			for(k = 0; k < 3; k++){
				score[i][k] = sc.nextInt();
				score1[i][k] = score[i][k];
			}
		}
		//sc.close();
		for(k = 0; k < 3; k++){
			for(i = 0; i < n; i++){
				for(int m = 0; m < n; m++){
					if(score[i][k] == score[m][k] || i != m){
						score1[i][k] = 0;
					}else{
					}
				}
			}
		}
		for(i = 0; i < n; i++){
			for(k = 0; k < 3; k++){
				sum[i] += score1[i][k];
			}
		}
		for(i = 0; i < n; i++){
			System.out.printf("%d\n", sum[i]);
		}
	
	}
 }