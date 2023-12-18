import java.math.BigDecimal;
import java.util.Scanner;

/**
 * TITLE : Maximum Volume
 * URL : https://atcoder.jp/contests/abc159/tasks/abc159_c
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        sc.close();
        BigDecimal l = new BigDecimal(L);
        BigDecimal a = new BigDecimal(L / 3);
        BigDecimal b = new BigDecimal(L / 3);
        BigDecimal c = l.subtract(a).subtract(b);
        System.out.println(a.multiply(b).multiply(c));
    }
}