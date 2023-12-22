
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = in.readLine();
            if (s == null || s.length() < 1) {
                break;
            }
            f(s);
        }
        /*/
        f("1 2 3 4 5 6");
        f("2 -1 -2 -1 -1 -5");
        f("2 -1 -3 1 -1 -3");
        f("2 -1 -3 -9 9 27");
        //*/
    }

    public static void f(String s) {
        String[] sp = s.split(" ");
        if (sp.length != 6)return;
        double[] a = {
            Double.parseDouble(sp[0]),
            Double.parseDouble(sp[1]),
            Double.parseDouble(sp[2]),
            Double.parseDouble(sp[3]),
            Double.parseDouble(sp[4]),
            Double.parseDouble(sp[5]),
        };
        double det = (a[0] * a[4] - a[3] * a[1]);
        if (det == 0)return;
        double x = (a[2] * a[4] - a[5] * a[1]) / det;
        x = Double.parseDouble(String.format("%.4f", Math.round(x * 1000) / 1000.0)) == 0 ? 0 : x;
        double y = (a[0] * a[5] - a[3] * a[2]) / det;
        y = Double.parseDouble(String.format("%.4f", Math.round(y * 1000) / 1000.0)) == 0 ? 0 : y;
        System.out.printf("%.4f %.4f\n", x, y);
    }
}