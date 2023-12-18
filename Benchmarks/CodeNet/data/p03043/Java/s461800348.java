import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();


/**
 * Xが出た場合
 * Xが出る確率＝1/N
 * (2)^Y > K/X
 *
 */
		double sum = 0 ;
		double a =  1.0/N;
		int max = 0 ;
		if(N < K) {
			max = N + 1;
		}else {
			max = K ;
		}
//		System.out.println("max=" + max);
		for(int i = 1 ; i < max ; i ++) {
			int X = (int)(Math.log(K/i)/Math.log(2)) + 1;
			double Z = Math.pow(2.0,X);
			double b =  1.0/Z;
			double p = a * b ;
//			System.out.println("i=" + i + " X=" + X);
//			System.out.println("Z=" + Z + " b=" + b);
			sum = sum + p;
//			System.out.println("p=" + String.format("%.12f", p) + " sum=" + String.format("%.12f", sum));
//			System.out.println("*********************************");
		}
		for(int i = max ; i <= N; i ++) {
			sum = sum + a;
		}
		System.out.println(String.format("%.12f", sum));
	}


}
