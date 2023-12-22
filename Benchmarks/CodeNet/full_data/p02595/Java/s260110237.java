import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		BigDecimal doubled = new BigDecimal(d).multiply(new BigDecimal(d));
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			sc.hasNextLine();
			int x = sc.nextInt();
			int y = sc.nextInt();
			BigDecimal doublex = new BigDecimal(x).multiply(new BigDecimal(x));
			BigDecimal doubley = new BigDecimal(y).multiply(new BigDecimal(y));
			if (doubled.compareTo(doublex.add(doubley)) >= 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
