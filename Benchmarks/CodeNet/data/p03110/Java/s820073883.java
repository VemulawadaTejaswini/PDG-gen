import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double ans = 0.0;
        for (int i=0; i<n; i++) {
            double x = in.nextDouble();
            String u = in.next();

            if (u.equals("JPY")) {
                ans += x;
            } else {
                ans += x * 380000;
            }
        }

        System.out.println(ans);

        in.close();
    }
}