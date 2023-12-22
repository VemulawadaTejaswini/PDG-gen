import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int min = h * 60 + m; //経過時間（min）
        double degLong = (min * 6) % 360;
        double degShort = (min * 0.5) % 360;
        double deg = Math.abs(degLong - degShort);
        double rad = Math.toRadians(deg);
        double cos = Math.cos(rad);
        double ans = Math.sqrt(a*a + b*b - 2*a*b*cos);
        System.out.println(ans);
    }
}
