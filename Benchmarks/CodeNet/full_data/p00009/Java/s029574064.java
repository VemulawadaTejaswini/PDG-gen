

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int i, j, cnt = 0, flg;
			for (i = 2; i <= n; i++) {
				flg = 0;
				for (j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						flg++;
						continue;
					}
				}
				if(flg == 0) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		scanner.close();
	}

}

