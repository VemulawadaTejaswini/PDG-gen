

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long cnt = 0;
		for(int i = 1; i <= n; i++){
			if(i % 3 != 0 && i % 5 != 0) cnt += i;
		}
		System.out.println(cnt);
		scanner.close();
	}

}
