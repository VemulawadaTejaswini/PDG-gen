import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        // 短針の角度
        double shortradian = (double)h * 30 + (double)m * 0.5;
        double y1 = Math.cos(Math.toRadians(shortradian)) * a;
        double x1 = Math.tan(Math.toRadians(shortradian)) * y1;
        
        // 長針の角度
        double longradian = (double)m * 6;
        double y2 = Math.cos(Math.toRadians(longradian)) * b;
        double x2 = Math.tan(Math.toRadians(longradian)) * y2;
        
        double tmp = Math.sqrt((y1-y2)*(y1-y2)+(x1-x2)*(x1-x2));
        
        // System.out.println(y1 + " " + y2);
        // System.out.println(x1 + " " + x2);
        System.out.println(tmp);
    }
}
