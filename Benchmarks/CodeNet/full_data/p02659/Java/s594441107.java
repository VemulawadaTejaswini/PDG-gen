import java.math.BigDecimal;

import java.util.Scanner;

public class Main2 {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        BigDecimal a2 = BigDecimal.valueOf(a);

        double b = sc.nextDouble();

        BigDecimal b2 = BigDecimal.valueOf(b);

        System.out.println(a2.multiply(b2).intValue());


    }
}
