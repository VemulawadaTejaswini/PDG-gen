import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] x = new double[n];
        String[] y = new String[n];
        double ans = 0.0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.next();
            if(y[i].equals("BTC")) {
                ans += x[i] * 380000.0;
            } else {
                ans += x[i];
            }
        }
        System.out.println(ans);
    }
}