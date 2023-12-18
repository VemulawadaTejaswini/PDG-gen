import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		//一回の実行にかかる時間
		int s = 1900*m + 100*(n-m);
		//全て成功する確率
		double p = 1/Math.pow(2, m);
		/**
		i回目に成功する確率pi
		double pi = Math.pow(1-p,i-1)*p
		i回目で成功する期待値
		double e = i*s*pi
		**/
		
		double te = s/p;
		
		
		
		System.out.println((int)te);
	}
	

}
