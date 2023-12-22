import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		BigDecimal a1 = new BigDecimal(String.valueOf(a));	//BigDecimalに変換
		BigDecimal b1 = new BigDecimal(String.valueOf(b));
		
		BigDecimal c= a1.multiply(b1);		//掛け算
		BigDecimal value =c.setScale(0, RoundingMode.DOWN);	//小数点切り捨て
		
		long l = value.longValueExact();	//long型に格納、小数の末尾を0に
		
		System.out.println(l);	
	}

}
