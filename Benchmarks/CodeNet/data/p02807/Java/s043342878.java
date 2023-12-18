import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	int n = sca.nextInt();
	long[] x = new long[n];
	for(int i = 0; i < n; i++) {
		x[i] = sca.nextLong();
	}
	long sa = 0;
	double bunsu = 0.0;
	double ans = 0.0;
	long ans_final = 0;

	// 各スライムが区間i～i+1を移動する確率を求める
	// スライムj(0 <= j < n+1)が区間i～i+1を移動する確率は
	// jが0からiまでのスライムについて、1/jで求められる。
	for(int i = 0; i < n-1; i++) {
		sa = x[i+1] - x[i];
		bunsu = 0.0;
		for(int j = 0; j <= i; j++) {
			bunsu = bunsu + 1.0/(j+1);
		}
		ans = ans + sa*bunsu;
	}

	for(int i = 2; i < n; i++) {
		ans = ans*i;
	}
	ans_final = (long)ans % 1000000007;

	System.out.println(ans_final);

	// 後始末
	sca.close();
	}
}