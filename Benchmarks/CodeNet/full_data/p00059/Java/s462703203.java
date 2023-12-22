import java.io.*;
import java.util.*;
import java.awt.geom.*;

public class Main {
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
    }

    double ax1;
    double ay1;
    double ax2;
    double ay2;
    double bx1;
    double by1;
    double bx2;
    double by2;
    boolean init() {
        if (!sc.hasNext()) return false;
        double x1, y1, x2, y2;
        ax1 = sc.nextDouble();
        ay1 = sc.nextDouble();
        ax2 = sc.nextDouble();
        ay2 = sc.nextDouble();
        bx1 = sc.nextDouble();
        by1 = sc.nextDouble();
        bx2 = sc.nextDouble();
        by2 = sc.nextDouble();
        return true;
    }

    void run() {
        while (init()) {
            if (ax2 >= bx1 && bx2 >= ax1 && ay2 >= by1 && by2 >= ay1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}