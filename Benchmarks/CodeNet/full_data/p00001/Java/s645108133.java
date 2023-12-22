import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner date = new Scanner(System.in);

		int [] num = new int [10];
		
		for (int i = 0; i < 10; i++) {
			num[i] = date.nextInt();
		}
		
		java.util.Arrays.sort(num);
		
		for (int i = 9; i > 4; i--) {
			System.out.println(num[i]);
		}
		
	
	}

}