/*
 * 
　 　 　 　　　　　　　 　 　　　　　　　　　　　　　　　　 ,.へ
　　___ 　　　　　　　 　 　 　 　 　　　　　　　　　　　　ム　　i
　「 ヒ_i〉　　　 　 　　　　　　 　 　　　　　　　　　　　　 ゝ　〈
　ト　ノ 　　　　　　　　　　　　　　　　　　　　　　　　　　iニ(()
　i 　{ 　 　　　　　　　 　　　＿＿＿_ 　 　　　　　　　　| 　ヽ
　i　　i　　　 　　　　　　　／__,　 , ‐-＼ 　 　 　 　 　　i 　　}
　|　　 i　　　　　　 　　／（●) 　 ( ● )＼　　　　　　 {、　 λ
　ト?┤.　　　　　　／ 　 　（__人__） 　　　＼　　　 ,ノ　‾ ,!
　i　　　ゝ、_ 　　　　|　　　　　´‾` 　 　　　　|　,. '´ハ　　　,!
.　ヽ、 　　　｀`　、,__＼ 　　 　 　　　　　 　 ／"　＼ 　ヽ／
　　　＼ノ　ノ　　　ハ‾r/:::r?--?/::７　　 ノ　　　　／
　 　　 　 ヽ.　　　　　　ヽ::〈； . '::. :' |::/　　 /　　　,. "
　　　　　　　 `ー 、　　　　＼ヽ::. ;::：|/　　　　　ｒ'"
　　　　　／‾二二二二二二二二二二二二二二二二ヽ
　　　　　| 答 |　　　　 　A C C E P T E D　　　　　　　│|
　　　　　＼＿二二二二二二二二二二二二二二二二ノ

 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
     * 各列の線の状態は、IOO, OIO, OOI, III の4通りしかないので、それらの間の遷移を考える。
     * ただし上手くやらないと線が連結ではなくなってしまうので、IIIはIOO->IIIとOOI->IIIの2通りに分けて考える
     */
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int MOD = 1000000;
	int N = scanner.nextInt();
	int M = scanner.nextInt();
	if (M == 2) {
	    long[][] dp = new long[N][5];
	    Arrays.fill(dp[0], 1);
	    dp[0][4] = 0;
	    for (int i = 1; i < dp.length; i++) {
		dp[i][0] += (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][4]);
		dp[i][0] %= MOD;
		dp[i][1] += (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]);
		dp[i][1] %= MOD;
		dp[i][2] += (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][3]);
		dp[i][2] %= MOD;
		dp[i][3] += (dp[i - 1][0] + dp[i - 1][3]);
		dp[i][3] %= MOD;
		dp[i][4] += (dp[i - 1][2] + dp[i - 1][4]);
		dp[i][4] %= MOD;
	    }

	    long ans = dp[N - 1][0] + dp[N - 1][1] + dp[N - 1][2]
		    + dp[N - 1][3];
	    ans %= MOD;
	    System.out.println(ans);
	} else {
	    long ans = 1;
	    for (int i = 0; i < N; i++) {
		ans *= 2;
		ans %= MOD;
	    }
	    System.out.println(ans);
	}

    }

}