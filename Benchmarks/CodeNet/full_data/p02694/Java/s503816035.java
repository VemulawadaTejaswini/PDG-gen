import java.math.BigDecimal;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int x = sc.nextInt();
        
        int year = 0;
        BigDecimal money = new BigDecimal(100, 0);
        BigDecimal X = new BigDecimal(x, 0);
        while(X.compareTo(money) != 1) {
            money = money.multiply(new BigDecimal("1.1", 1));
            year++;
        }

		// 出力
		System.out.println(year);
	}
}