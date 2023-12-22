import java.math.BigDecimal;

import java.util.*;
public class Main {
public static void main(String[]args) {
	Scanner sc = new Scanner (System.in);
	long a= sc . nextLong();
	double d = sc.nextDouble();
	BigDecimal b = new BigDecimal(d);
	BigDecimal prod = new BigDecimal(a* b.doubleValue());
	System.out.println(prod.setScale(0, BigDecimal.ROUND_DOWN));
}
}
