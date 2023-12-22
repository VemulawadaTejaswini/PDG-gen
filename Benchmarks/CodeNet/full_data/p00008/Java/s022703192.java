import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner date = new Scanner(System.in);

		int num;
		
		while (date.hasNextInt()) {
			int cnt = 0;
			num = date.nextInt();
			for (int a = 0; a < 10; a++) {
				for (int b = 0; b < 10; b++) {
					for (int c = 0; c < 10; c++) {
						for (int d = 0; d < 10; d++) {
							int sum = a + b + c + d;
							if (sum == num) {
								cnt++;
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}
		
	
	}

}