
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double angle = scan.nextDouble();

        double S = 0.5 * a * b * Math.sin(Math.PI * angle / 180.0);
        double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.PI * angle / 180.0));
        double h = (2 * S) / a;

        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }

}
