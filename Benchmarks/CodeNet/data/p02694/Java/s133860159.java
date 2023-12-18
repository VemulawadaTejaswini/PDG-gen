import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Float intVal = scan.nextFloat();
		BigDecimal riritu = BigDecimal.valueOf(0.01);
		BigDecimal bank = BigDecimal.valueOf(100);
		int year = 0;
		while(intVal >= bank.intValue()) {
			bank = bank.add((bank.multiply(riritu)));
			bank = bank.setScale(0, BigDecimal.ROUND_DOWN);
			year ++;
		}
		System.out.println(year);

		scan.close();
			}

}