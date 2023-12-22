import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long length = (long)Math.log10(n)+1;
		long ans =0;
		
		if(length%9==0) {
				ans=sumDigits(n);
		}
		
		if(ans%9==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
	public static long sumDigits(long n) {
	    long sum = 0;
	//自然数の各桁の和を計算
	    while (n != 0) {
	//sumDigitsは単独ではloopしないので、while loopを使う。
	        sum += n % 10;
	//再右端の桁を得るために%10を利用する。
	        n /= 10;
	//再右端の桁を取り除くためにn/=10を利用する。
	    }


	    return sum;//合計を返す
	}
}