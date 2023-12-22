import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		double d=sc.nextInt();
		double e=sc.nextInt();
		double f=sc.nextInt();
		double x=(c*e-b*f)/(a*e-d*b);
		double y=(c-a*x)/b;
		System.out.println(new BigDecimal(x).setScale(3,BigDecimal.ROUND_FLOOR)+" "+new BigDecimal(y).setScale(3,BigDecimal.ROUND_FLOOR));
		sc.close();
	}
}