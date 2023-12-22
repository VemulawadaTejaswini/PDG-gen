import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (i % 2 == 1 && tmp % 2 == 1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
