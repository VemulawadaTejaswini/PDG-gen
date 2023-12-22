import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigDecimal sum = new BigDecimal("1");
		BigDecimal big[] = new BigDecimal[n];
		String a[] = new String[n];
		for(int i = 0; i < n; i++) {
			big[i] = sc.nextBigDecimal();
			sum = sum.multiply(big[i]);
		}
		
		BigDecimal over = new BigDecimal("1000000000000000000");
		BigDecimal ov = new BigDecimal(-1);
		int result = over.compareTo(sum);
		if(result==-1) {
			System.out.println(result);
		}else {
			System.out.println(sum);
		}
	}
}