import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long [] list = new long [5];

		//グループ人数
		long n = sc.nextLong();
		//最小人数
		long min = Long.MAX_VALUE;


		for (int i = 0; i < 5; i++) {
			list[i] = sc.nextLong();
			long v = list[i];
			if(v < min) {
				min = v;
			}
		}

		if(n / min <= 1) {
			System.out.println(5);
		}else {
			if(n % min == 0){
				long ans = (long)Math.ceil(n / min) + 4 ;
				System.out.println(ans);
			}else {
				long ans = (long)Math.ceil(n / min) + 5;
				System.out.println(ans);
			}
		}
	}
}
