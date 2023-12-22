import java.util.Scanner;
import java.math.BigDecimal;

public class Main{

    public static void main(String argv[])
    {
	Scanner scan = new Scanner(System.in);
	double r = scan.nextDouble();
	double S,L;

	S = Math.pow(r,2) * Math.PI;
	L = 2 * r * Math.PI;
	BigDecimal x = new BigDecimal(S);
x = x.setScale(6,BigDecimal.ROUND_HALF_UP);
	BigDecimal y = new BigDecimal(L);
y = y.setScale(6,BigDecimal.ROUND_HALF_UP);
	System.out.println(x+" "+y);
    }
}