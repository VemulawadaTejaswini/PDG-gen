import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		int cnt = 1;
		int before = 0;
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			int a = sc.nextInt();
			if (i != 0) {
				if (Math.abs(a-before) <= k) {
					cnt++;
				}
			}
			before = a;
		}
		System.out.println(cnt);
	}
}
