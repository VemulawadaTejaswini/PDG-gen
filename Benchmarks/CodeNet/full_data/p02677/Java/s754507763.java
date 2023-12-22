import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        double ma = M * 6.0;
        double ha = 30 * H + 0.5 * M;

        double deg = ma - ha;
        if (deg < 0) {
            deg *= -1;
        }
        if (180 < deg) {
            deg -= 180;
        }

        double cos = Math.cos(Math.toRadians(deg));
        cos = Math.round(cos * Math.pow(10, 12)) / Math.pow(10, 12);
        System.out.println(Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) + (-2 * A * B) * cos));
    }
}