import java.util.Scanner;

public class Main {
    private static final String YES = "YES";
    private static final String NO  = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 鬼の初期位置
        int a = sc.nextInt();
        // 鬼の速度
        int v = sc.nextInt();
        // 逃げる子供の初期位置
        int b = sc.nextInt();
        // 速度
        int w = sc.nextInt();
        
        double t = sc.nextDouble();
        
        boolean isCatch = false;

        if (a == b) {
            isCatch = true;
        } else if (v <= w) {
            isCatch = false;
        } else {
            double time = ((double)Math.abs(b - a)) / (v - w);
            // double time = Math.abs(b - a) / (v - w);
            System.out.println(time);
            isCatch = (time <= t);
        }

        System.out.println(isCatch ? YES : NO);
    }
}