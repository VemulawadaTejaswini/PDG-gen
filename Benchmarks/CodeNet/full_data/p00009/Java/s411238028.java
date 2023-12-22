import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner date = new Scanner(System.in);

		int num;
		
		while (date.hasNextInt()) {
			int cnt = 0;
			num = date.nextInt();
			if (num > 0) {
				if (num == 2) {
					cnt = 1;
				} else if (num == 3) {
					cnt =2;
				} else {
					for (int i = 1; i <= num; i++) {
						for (int j = 2; j <= i;) {
							if (i % j != 0) {
								cnt++;
								break;
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}
		
	
	}

}