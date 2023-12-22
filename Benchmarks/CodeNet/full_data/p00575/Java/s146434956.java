import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int total = 0;
		int loginCount = 0;

		while(true) {
			loginCount++;
			total += a;
			if(loginCount % 7 == 0) total += b;

			if(total >= c) break;
		}
		System.out.println(loginCount);
	}
}

