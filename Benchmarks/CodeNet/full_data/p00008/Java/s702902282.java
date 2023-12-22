

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int a, b, c, d, cnt =0;
			for(a = 0; a < 10; a++) {
				for(b = 0; b < 10; b++) {
					for(c = 0; c < 10; c++) {
						for(d = 0; d < 10; d++) {
							if(a + b + c + d == n) {
								cnt++;
								continue;
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}

		scanner.close();
	}

}

