import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, min;
		int sum = 0;

		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int[] score = new int[n];
			for(int i=0; i<n; i++){
				score[i] = sc.nextInt();
				sum += score[i];
			}
			max = score[0];
			min = score[0];
			for(int i=1; i<n; i++){
				if(score[i]>max){
					max = score[i];
				}
				if(score[i]<min){
					min = score[i];
				}
			}
			sum -= (max+min);
			System.out.println(sum/(n-2));
			sum = 0;
		}
	}
}