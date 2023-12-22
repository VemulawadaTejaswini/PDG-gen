import java.util.Scanner;
import java.lang.Object;
import java.math.BigDecimal;
public class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int d=a/b;
		int r=a%b;
		double f=(double)a/b;
		double ans=new BigDecimal(String.valueOf(f)).setScale(10,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(d+" "+r+" "+ans);
	}
}