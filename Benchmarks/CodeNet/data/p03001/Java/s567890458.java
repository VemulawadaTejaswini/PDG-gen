import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double ans = 0.0;
        double ans2 = 0.0;
        if(x < y) {
            ans = h * x;
            ans2 = w * (h - y);
        } else {
            ans = w * y;
            ans2 = h * (w - x);
        }
        int ans3 = 0;
        if(x == y || ans == ans2) ans3 = 1;

        System.out.println(ans + " " + ans3);
    }
}