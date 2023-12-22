import java.util.Scanner;

public class Main {
    // １分間に長針が動く角度
    private static double LONG_ANGLE  = 0.5;
    // １分間に短針が動く角度
    private static double SHORT_ANGLE = 6.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 長針の長さ
        int a = sc.nextInt();
        // 短針の長さ
        int b = sc.nextInt();
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println(
                Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(shortAngle(h, m)))));
    }

    /**
     * 指定した時間の長針と短針が作り出す小さい角度を返します。
     *
     * @param h 時間
     * @param m 分
     * @return 短針と長針が作り出す角度
     */
    private static double shortAngle(int h, int m) {
        double a = LONG_ANGLE * (h * 60 + m);
        double b = SHORT_ANGLE * m;

        if (Math.abs(a - b) >= 180) {
            return Math.abs(a - b) - 180.0;
        }

        return Math.abs(a - b);
    }
}