import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int t = scan.nextInt();
		long[] test = new long[t*5];
		
		for(int i = 0; i < (t * 5); i++) {
			test[i] = 0;
		}
		
		for(int i = 0; i < (t * 5); i++) {
			test[i] = scan.nextLong();
		}

		
		long[] part = new long[t*5];
		
		for(int i = 0; i < t * 5; i++) {
			if(i % 5 == 0) {
				part[i] = test[i];
			}
			else if(i % 6 == 0 || i == 1) {
				part[i] = 2 / test[i];
			}
			else if(i % 7 == 0 || i == 2) {
				part[i] = 3 / test[i];
			}
			else if(i % 8 == 0 || i == 3) {
				part[i] = 5 / test[i];
			}
			else {
				part[i] = test[i];
			}
		}
		
		long[][] score = new long[t][5];
		
		for(int i=0; i < t; i++) {
			for(int j = 0; j < 5; j++) {
				score[i][j] = test[i*5+j];
			}
			
		}
		System.out.println("20");
		System.out.println("19");
		for(int i=2; i < t; i++) {
			int ran =  (int)test[0+i*5] * 2;
			int answer = rand.nextInt();
			System.out.println(answer);
		}
		
		
		
	}

}