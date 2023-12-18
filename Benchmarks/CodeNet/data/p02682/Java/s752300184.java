import java.util.Scanner;

// https://atcoder.jp/contests/abc167/tasks/abc167_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		sc.close();

//		long startTime = System.currentTimeMillis();

		long ans = 0L;
		for(long i=0L;i<k;i++) {
			if(a>0L) {
				ans = ans + 1;
				a = a - 1L;
			}else if(b>0L) {
				b = b - 1L;
			}else if(c>0L) {
				ans = ans - 1L;
				c = c - 1L;
			}
		}
		System.out.println(ans);
//
//		long endTime = System.currentTimeMillis();
//		System.out.println("開始時刻：" + startTime + " ms");
//		System.out.println("終了時刻：" + endTime + " ms");
//		System.out.println("処理時間：" + (endTime - startTime) + " ms");
	}
}
