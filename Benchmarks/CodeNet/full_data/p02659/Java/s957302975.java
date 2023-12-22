import java.math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();


        BigDecimal a = new BigDecimal(A);
        BigDecimal b = new BigDecimal(A);

        System.out.println(a.multiply(b).toBigInteger());
    }
}