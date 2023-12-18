import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i= 1;i<=n;i++) {
            String x = sc.next();
            if (x.equals("JPY")) {
                sum += sc.nextInt();
            } else {
                double u = sc.nextDouble();
                sum += u * (double )380000;
            }
        }
        System.out.println(sum);
    }
}