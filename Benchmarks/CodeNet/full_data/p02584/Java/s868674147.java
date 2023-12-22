import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long x  = Math.abs(sc.nextLong());
		long k  = sc.nextLong();
		long d  = sc.nextLong();
		long ans = 0;

		//0に近づけるだけでk回動く場合
		if(k * d <= x) {
			System.out.println(x - (k * d));
			sc.close();
			return;
		}
		
		//最初にできるだけ0に近づける
		long devide = x / d;
		//long rest = x - (d * devide);
		long rest = x % d;
		
		//k - divideが偶数なら何もしない
		if((k - devide) % 2 == 0) {
			ans = rest;
		}else {
		//k - divideが奇数なら1度だけ動かして絶対値の小さいほう
			ans = Math.abs(rest - d);
		}
		
		System.out.println(ans);
		sc.close();
	}
}


