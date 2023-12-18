import java.util.*;

public class Main {
	public static void main(String[] args) {
		//整数値を入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;

		for(int i = 1 ; i <= n ; i++) {
			if(i >= k + 1) {
				sum += y;
				continue;
			}
			sum += x;
		}
		System.out.println(sum);
	}
}