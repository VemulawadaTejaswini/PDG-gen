
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int li = sc.nextInt();
        double l = (double) li / d;
        for (double r = 0; r < Math.PI / 2; r += 0.5e-6) {
            double hc = h * Math.cos(r);
            double ds = d * Math.sin(r);
            if (hc > ds) {
                double dq = d * Math.cos(r);
                double hq = h * Math.sin(r);
                double du = hc - ds;
                double duq = du * Math.tan(r);
                double pp = du/Math.cos(r);
                double cap = pp * d + (h-pp)*d/2;
                if (cap <= l) {
                    //System.out.println("a:" + cap);
                    System.out.println(r * (180 / Math.PI));
                    return;
                }
            } else {
                double dh = h / Math.tan(r);
                double cap = h * dh / 2;
                if (cap <= l) {
                    //System.out.println("b:" + cap);
                    System.out.println(r * (180 / Math.PI));
                    return;
                }
            }
        }
        System.out.println(90.0);
    }
}