
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count_list [] = new int [n];
		int ans = 999999;

		for(int i = 0; i < n ; i++) {
			count_list[i] = sc.nextInt();
		}

		for(int i = 1; i < n; i++) {
			int l = 0 ,r = 0;
			for(int j = 0; j < i; j++) {
				l += count_list[j];
			}
			for(int j = i; j < n; j++) {
				r += count_list[j];
			}

			ans = Math.min(ans,Math.abs(l-r));
			System.out.println(l + "-" + r);
		}
		System.out.println(ans);