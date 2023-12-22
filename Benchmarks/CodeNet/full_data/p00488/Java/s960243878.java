import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		
		int [] pasta = new int [3];
		int [] juice = new int [2];
		
		int i, j;
		
		int sum = 0;
		int min = 9999;
		
		for (i = 0; i < 3; i++) {
			pasta[i] = sc.nextInt();
		}
		
		for (i = 0; i < 2; i++) {
			juice[i] = sc.nextInt();
		}
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++) {
				sum = pasta[i] + juice[j] - 50;
				if (sum < min) {
					min = sum;
				}
			}
		}
		
		System.out.println(min);
		
	}

}