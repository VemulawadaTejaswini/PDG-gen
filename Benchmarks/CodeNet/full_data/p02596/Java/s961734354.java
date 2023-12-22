import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println(-1);
			System.exit(0);
		} else if (a % 5 == 0) {
			System.out.println(-1);
			System.exit(0);
		}
		BigDecimal k = new BigDecimal(a);
		List<BigDecimal> exactList = new ArrayList<BigDecimal>();
		for (int i = 1; ; i++) {
			BigDecimal target = new BigDecimal(7);
			BigDecimal ten = new BigDecimal(1);
			for (int j = 0; j < i; j++) {
				if (j == 0) {
					continue;
				}
				ten = ten.multiply(new BigDecimal(10));
				target = target.add(ten.multiply(new BigDecimal(7)));
			}
			if (target.remainder(k).compareTo(BigDecimal.ZERO) == 0) {
				System.out.println(i);
				break;
			}
			BigDecimal exact = target.remainder(k);
			if (exactList.contains(exact)) {
				System.out.println(-1);
				break;
			}
			exactList.add(exact);
		}
		
	}
}
