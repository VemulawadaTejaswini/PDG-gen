import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final double A = Integer.parseInt(sc.next());  // 時針
        final double B = Integer.parseInt(sc.next());  // 分針
        final double H = Integer.parseInt(sc.next());  // 時間
        final double N = Integer.parseInt(sc.next());  // 分

        final double parseH = (double) H * 30;
        final double parseN = (double) N * 6;
        double diff = Math.abs(parseH - parseN);

        if (diff >= 180.0) {
            diff -= (double)180;
        }

        final double ans = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - (double)2 * A * B * Math.cos(Math.toRadians(diff)));
        System.out.print(ans);
    }
}