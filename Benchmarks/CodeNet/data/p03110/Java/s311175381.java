import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ansJ = 0;
		double ansB = 0;
		for (int count = 0; count < a ; count++) {
			double c = sc.nextDouble();
			String b = sc.next();
			
			if(b.equals("JPY")) {
				ansJ = ansJ + (int)c;
			} else {
				ansB = ansB + c;
			}
		}
		double ans = ansJ + ansB * 380000;
		BigDecimal aaa = BigDecimal.valueOf(ans);
		BigDecimal show = aaa.setScale(4, BigDecimal.ROUND_HALF_UP);
		System.out.println(show);
}
}