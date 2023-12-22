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
        
        int t = sc.nextInt();
        
        boolean isCatch = false;

        if (a == b) {
            isCatch = true;
        } else if (v <= w) {
            isCatch = false;
        } else if (a < b) {
            // 正の方向
            long aPoint = v * t + a;
            long bPoint = w * t + b;
            
            isCatch =  bPoint <= aPoint; 
        } else {
            // 負の方向
            long aPoint = (-v * t) + a;
            long bPoint = (-w * t) + b;
            isCatch = bPoint >= aPoint;
        }

        System.out.println(isCatch ? YES : NO);
    }
}