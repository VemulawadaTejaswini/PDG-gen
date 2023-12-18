import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//i+1と比較して小さいほうがiとi+1に入る
		//一番右はBの最後尾がそのまま入る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N + 2];
		num[0] = 1000000;
		num[N] = 1000000;
		num[N + 1] = 1000000;
		//前後と自分を見る
		for(int i = 1; i < N; i++) {
			num[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += Math.min(num[i - 1], Math.min(num[i], num[i + 1]));
		}
		System.out.println(sum);

	}

}
