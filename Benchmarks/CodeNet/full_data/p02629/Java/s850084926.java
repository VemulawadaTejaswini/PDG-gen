import java.util.Scanner;
import java.util.Arrays;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String out = "";

		// 整数の入力
		BigDecimal a = sc.nextBigDecimal();//番号
		BigDecimal b = new BigDecimal("0");
		while (a.compareTo(new BigDecimal("26")) > 0) {
			b = new BigDecimal(a.intValue());
			out = String.valueOf(alpha.charAt(b.remainder(new BigDecimal("26")).subtract(new BigDecimal("1")).intValue())) + out;
			a = a.divide(new BigDecimal("26"), 0, BigDecimal.ROUND_DOWN);
		}
		if (a.compareTo(new BigDecimal("0")) > 0) {
			if (a.remainder(new BigDecimal("26")).compareTo(new BigDecimal("0")) > 0) {
				out = String.valueOf(alpha.charAt(a.remainder(new BigDecimal("26")).subtract(new BigDecimal("1")).intValue())) + out;
			} else {
				out = String.valueOf(alpha.charAt(25)) + out;
			}
		}
		System.out.println(out);
	}
}