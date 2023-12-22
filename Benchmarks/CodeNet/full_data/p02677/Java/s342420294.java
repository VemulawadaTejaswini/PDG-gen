import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        // 角度を求める
        double kakudoA = (double) (0.5 * (H * 60 + M));
        double kakudoB = (double) (6 * M);
        double kakudoC = Math.abs(kakudoA - kakudoB);

        double c = 0;
        if (kakudoC == 0) {
            c = Math.abs(A - B);
        } else if (kakudoC == 180) {
            c = A + B;
        } else if (kakudoC < 180) {
            c = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(kakudoC)));
        } else {
            kakudoC = 360 - kakudoC;
            c = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(kakudoC)));
        }
        System.out.println(c);
        return;
    }
}