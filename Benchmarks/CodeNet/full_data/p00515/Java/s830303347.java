package AOJ0414;
import java.util.Scanner;
public class averagescore1 {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int[] score = new int [5];
		int i, sum = 0;
		for(i = 0; i < 5; i++){
			score[i] = sc.nextInt();
			if(score[i] < 40){
				score[i] = 40;
			}
		}
		//System.out.printf("%d\n", score[0]);
		for(int k = 0; k < 5; k++){
			sum = sum + score[k];
		}
		System.out.printf("%d\n", sum / 5);
	}

}