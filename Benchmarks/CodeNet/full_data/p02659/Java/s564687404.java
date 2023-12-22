import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		BigDecimal bigA=new BigDecimal(A);
		double B=sc.nextDouble();
		BigDecimal bigB=new BigDecimal(B);
		
		BigDecimal result=bigA.multiply(bigB);
		BigDecimal rastResult=result.setScale(0,RoundingMode.FLOOR);
		System.out.println(rastResult);
	}

}
