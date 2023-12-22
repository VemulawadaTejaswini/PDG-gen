import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long[] a = new long[n];
		long ans = 1;
		long c = 1000000000;
		long b = 1000000000;
		long lim = c * b;
		BigDecimal answ = new BigDecimal(1);

		for (int i = 0; i < n ;  i++) {
			a[i] = scan.nextLong();
			BigDecimal tmp = new BigDecimal(a[i]);
			answ = answ.multiply(tmp);
			ans *= a[i];
		}
		
		int over = -1;
		
		if(ans > lim) {
			System.out.println(over);
		}
		else {
			System.out.println(answ);
		}
	}

}
