import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double X = sc.nextDouble();

        double left = 0;
        double right = 1e9 + 1;
        int center;


        if (A * 1e9 + B * getD(1e9) <= X) {
            System.out.println(BigDecimal.valueOf(1e9).toPlainString());
            return;
        }

        while (left + 1 < right) {
            center = (int) (right + left) / 2;
            if (A * center + B * getD(center) <= X)
                left = center;
            else
                right = center;
        }

        System.out.println((int) left);

    }

    static int getD(double N) {
        return (int) Math.log10(N) + 1;
    }
}
