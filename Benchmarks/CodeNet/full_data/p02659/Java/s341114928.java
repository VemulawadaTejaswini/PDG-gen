import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan =new Scanner(System.in);
		long A=scan.nextLong();
		double B=scan.nextDouble();
		double seki=A*B;
		 BigDecimal bd = new BigDecimal(seki);
		 BigDecimal bd3 = bd.setScale(0, BigDecimal.ROUND_DOWN);  
		System.out.println(bd3);
	}
}