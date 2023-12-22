import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		BigDecimal A=new BigDecimal(sc.nextLong());
		BigDecimal B=new BigDecimal(sc.next());
		
		BigDecimal result=A.multiply(B);
		BigDecimal BigResult=result.setScale(0,RoundingMode.DOWN);
		System.out.println(BigResult);
	
	}

}