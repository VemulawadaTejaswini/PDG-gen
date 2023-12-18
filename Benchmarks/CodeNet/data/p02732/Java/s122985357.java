import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		int[] cnt = new int[N];

		//各番号ごとの組み合わせを計算する
		for(int i = 0; i < N; i++) {
			cnt[nums[i]-1] ++;
		}

		int result = 0;
		//各項目の組み合わせを計算する。
		for(int i = 0; i < N; i++) {
			int count = 0;
			int num = cnt[i];
			for(int j = 1; j < num; j++) {
				count = count + num - j;
			}
			result = result + count;
		}

		for(int i = 0; i < N; i++) {
			System.out.println(result - (cnt[nums[i]-1] - 1));
		}
	}
}