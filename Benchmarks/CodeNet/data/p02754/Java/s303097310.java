import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double remain = N % (A + B);
        if (remain>A) {
            remain=A;
        }
        double num= N / (A + B);

        BigDecimal result=new BigDecimal(num*A+remain);
        System.out.println(result.toPlainString());

        sc.close();

    }
}