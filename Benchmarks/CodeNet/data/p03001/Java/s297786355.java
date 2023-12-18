import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int yoko = W - x > x ? x : W - x;
		int tate = H - y > y ? y : H - y;
		
		BigDecimal yokomen = BigDecimal.ZERO;
		BigDecimal tatemen = BigDecimal.ZERO;
		
		yokomen = new BigDecimal(yoko * H);
		tatemen = new BigDecimal(W * tate);
		
		if (yokomen.compareTo(tatemen) == 0) {
			System.out.println(yokomen.setScale(6, RoundingMode.DOWN)+" "+1);
		} else if (yokomen.compareTo(tatemen) == -1) {
			System.out.println(tatemen.setScale(6, RoundingMode.DOWN)+" "+0);
		} else {
			System.out.println(yokomen.setScale(6, RoundingMode.DOWN)+" "+0);
		}
	}		
}
