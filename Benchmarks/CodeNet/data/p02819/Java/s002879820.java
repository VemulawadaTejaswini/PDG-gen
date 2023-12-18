import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int ptr = 0;						// 得られた素数の個数
		int[] prime = new int[10000000];	// 素数を格納する配列
		Scanner stdIn = new Scanner(System.in);
		int st;
		do{
			st = stdIn.nextInt();
		}while(st<2||st>100000);
		int min = 0;
		prime[ptr++] = 2;					// ２は素数である
		prime[ptr++] = 3;					// ３は素数である

		for (int n = 5 ; n <= Integer.MAX_VALUE; n += 2) {		// 対象は奇数のみ
			boolean flag = false;
			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				if (n % prime[i] == 0) {	// 割り切れると素数ではない
					flag = true;
					break;						// それ以上の繰返しは不要
				}
			}
			if (!flag) {						// 最後まで割り切れなかったら
				prime[ptr++] = n;// 素数として配列に登録
				if(n >= st) {
					min = n;
					break;
				}
			}
		}
			System.out.println(min);
	}
}
