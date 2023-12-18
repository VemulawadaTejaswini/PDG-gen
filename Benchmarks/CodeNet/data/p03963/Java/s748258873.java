import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		
		System.out.println(BigDecimal.valueOf(b*Math.pow(b-1, a-1)).toPlainString());//BigDecimal.valueOf(d1).toPlainString()
	}
}

