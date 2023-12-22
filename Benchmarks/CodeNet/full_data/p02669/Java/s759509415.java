import java.util.Arrays;
import java.util.Scanner;

// https://atcoder.jp/contests/agc044/tasks/agc044_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			long wa = d;
			long ans = 1L;

			boolean flag = true;


			long[][] aaa = new long[(int) n][4];
			Arrays.fill(aaa,0L);
			long[] coins= new long[(int) n];
			Arrays.fill(coins,n);
//			while(flag) {
//
//				if(wa>=n) {
//					System.out.println(ans);
//					flag = false;
//				}
//			}
		       // 処理前の時刻を取得
			long startTime = System.currentTimeMillis();
			System.out.println("開始時刻：" + startTime + " ms");

			for(long j=1;j<100000000000000000L;j=j+1L) {

				System.out.println(j);
			}
	        // 処理後の時刻を取得
			long endTime = System.currentTimeMillis();

			System.out.println("終了時刻：" + endTime + " ms");
			System.out.println("処理時間：" + (endTime - startTime) + " ms");


			if(2L*wa*(a*b*c)>2L) {
				System.out.println(2L*wa*(a*b*c));
			}
		}
		sc.close();


	}
}
