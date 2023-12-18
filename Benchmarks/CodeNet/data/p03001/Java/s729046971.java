

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        double res = (double)a * b / 2;
        BigDecimal bd = new BigDecimal(res);
        System.out.print(bd.setScale(6, RoundingMode.HALF_UP) + " ");


        if(2*x == a && 2*y == b) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
