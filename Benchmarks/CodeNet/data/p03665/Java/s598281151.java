package trialAnswer;

/**
 * [キーワード]split, for文, list
 *
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int ans = 0;
		int all = 0;
		int n = sc.nextInt();
		int p = sc.nextInt();
		if( all % 2 == p ){
			ans++;
		}
		for(int in=1; in<=n; in++){
			int a = sc.nextInt();
			all += a;
			if( all % 2 == p ){
				ans++;
			}
		}

		// 出力
		System.out.println(ans);
	}
}