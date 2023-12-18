import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            double x = scan.nextDouble();
            String y = scan.next();
            double t = "JPY".equals(y) ? 1 : 380000;
            sum += x * t;
        }
        System.out.println(sum);
    }
}
