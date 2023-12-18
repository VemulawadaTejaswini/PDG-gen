import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y =  sc.nextInt();
		sc.close();
		BigDecimal bdw = new BigDecimal(W);
		BigDecimal bdh = new BigDecimal(H);
		double d = bdw.multiply(bdh).divide(new BigDecimal("2.0")).doubleValue();
		if(x* 2== W && y * 2 == H) {
			System.out.println(d +" "+"1");
		}else {
			System.out.println(d +" "+"0");
		}
	}
}