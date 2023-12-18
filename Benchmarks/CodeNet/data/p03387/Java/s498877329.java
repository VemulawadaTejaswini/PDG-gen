import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int max, mid, min;
		int [] list = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

		Arrays.sort(list);
		min = list[0];
		mid = list[1];
		max = list[2];

		for ( int i = mid; i < max; i++) {
			ans++;
			min++;
		}
		for ( int i = min; i < max; i += 2) {
			ans ++;
			min += 2;
		}
		if (max == min) {
			System.out.println(ans);
		}else {
			System.out.println(ans + 1);
		}


		}
}
