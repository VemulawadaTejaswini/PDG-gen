import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int H = scan.nextInt();
        int M = scan.nextInt();
        double hour_unit = (double) 360 / (12 * 60);
        double minute_unit = 360 / 60;
        double hours = hour_unit * (60 * H + M);
        double minutes = minute_unit * M;
        double hours_pi = Math.PI * (360 - hours) / 180;
        double minute_pi = Math.PI * (360 - minutes) / 180;
        double hours_x = A * Math.cos(hours_pi);
        double hours_y = A * Math.sin(hours_pi);
        double minutes_x = B * Math.cos(minute_pi);
        double minutes_y = B * Math.sin(minute_pi);
        double ans = (hours_x - minutes_x) * (hours_x - minutes_x) + (hours_y - minutes_y) * (hours_y - minutes_y);
        System.out.printf("%.12f\n", Math.sqrt(ans));
    }
}
