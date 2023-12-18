import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = 1;
		long b = 1;
		long c = 1;
//gvd(a,b,c)のような形にする
		long N = sc.nextLong();
		long total = 0;
		String OK = "";
		//メソッドインスタンス化
		sample gcd1 = new sample();
		//(1,1,1)(1,1,2)の場合を先にしておく。
		total = gcd1.gcd(a,b,c,total);
		if(a == b && b ==c) {
			c += 1;
			total = gcd1.gcd(a,b,c,total);
		}
		//a,b,cの値がNより大きく、かつ全て等しくなるまで回す
			while( OK != "ok") {

			if(c < N) {
					while(c < N) {
						c += 1;
						total = gcd1.gcd(a,b,c,total);

					}
			}else if(b < N) {
				c = c-(N-1);
				while(b < N) {
					b += 1;
					total = gcd1.gcd(a,b,c,total);

				}
			}else{
				b = b-(N-1);
				c = c-(N-1);
				while(a < N) {
					a += 1;
					total = gcd1.gcd(a,b,c,total);

				}
			}
			if(a == b && b ==c) {

				OK = "ok";
			}
		}
		System.out.println(total);
	sc.close();
}
	//最大公約数を求めるメソッド
	public long gcd (long a, long b, long c, long total) {
		long temp = 0;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		while((temp = b%c)!=0) {
			b = c;
			c = temp;
		}
		total += c;
		return total;
	}
}
