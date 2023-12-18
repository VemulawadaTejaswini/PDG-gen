import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt = 0;
		int max = (int)Math.pow(a, b);
		cnt = ((a - c) * b * a) + a;
		BigDecimal biCnt = new BigDecimal(cnt);
		BigDecimal biMax = new BigDecimal(max);
		BigDecimal biAnc = biCnt.divide(biMax,10,RoundingMode.HALF_UP);
		System.out.println(biAnc);
	}
}