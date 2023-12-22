import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		for(int i = 0 ; i < score.length ;i++){
			int num = sc.nextInt();
			if(num < 40 ){
				score[i] = 40;
			} else{
				score[i] = num;
			}
			sum += score[i];
		}
		System.out.println(sum/5);
		sc.close();
	}

}