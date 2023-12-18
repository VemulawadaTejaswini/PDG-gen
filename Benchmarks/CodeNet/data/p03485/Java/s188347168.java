import java.math.BigDecimal;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int inputA = sc.nextInt();
		int inputB = sc.nextInt();
		sc.close();
		
		BigDecimal bd = new BigDecimal((inputB + inputA) / 2);
		
		System.out.println(bd.setScale(0, BigDecimal.ROUND_UP));
	}
}