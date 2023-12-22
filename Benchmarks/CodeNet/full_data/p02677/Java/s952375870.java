

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        double a=gd();
        double b=gd();
        double h=gd();
        double m=gd();

        //System.out.println("No");

        BigDecimal hk=BigDecimal.valueOf((h*60+m)/2);
        BigDecimal mk=BigDecimal.valueOf(m*6);
        BigDecimal k=BigDecimal.valueOf(Math.abs(hk.subtract(mk).doubleValue()));
        if (k.doubleValue()>180) k=BigDecimal.valueOf(360).subtract(k);
        k=BigDecimal.valueOf(Math.PI).multiply(k);
        k=k.divide(BigDecimal.valueOf(180), 11, RoundingMode.HALF_UP);
        double s=a*a+b*b;
        k=BigDecimal.valueOf(Math.cos(k.doubleValue()));
        k=k.multiply(BigDecimal.valueOf(a)).multiply(BigDecimal.valueOf(2*b));

        System.out.print(Math.sqrt(BigDecimal.valueOf(s).subtract(k).doubleValue()));
	}


	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}