import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		int n = sc.nextInt();
		if(n == 0){
			break;
		}
		int[] score = new int[n];
		int max_score = -1, min_score = 1001;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
			if(max_score < score[i]){
				max_score = score[i];
			}else if(min_score > score[i]){
				min_score = score[i];
			}
		}
		System.out.printf("\n%d",(sum - max_score - min_score) / (n - 2));
		}

	}
       System.out.println();
}
