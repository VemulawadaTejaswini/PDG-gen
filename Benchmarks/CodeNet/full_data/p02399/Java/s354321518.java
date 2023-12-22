import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d,r;
		double f;
		d = b/c;
		r = b - (c * d);
		f = (double)b/(double)c;
		BigDecimal bd = new BigDecimal(f+ 0.00000000001);
		System.out.println(d+" "+r+" "+(bd ));
	}

}