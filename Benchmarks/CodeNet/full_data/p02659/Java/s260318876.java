import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		BigDecimal a1 = new BigDecimal(String.valueOf(a));
		BigDecimal b1 = new BigDecimal(String.valueOf(b));
		
		BigDecimal c= a1.multiply(b1);
		BigDecimal value =c.setScale(0, RoundingMode.DOWN);
		
		long l = value.longValueExact();
		
		System.out.println(l);	
	}

}