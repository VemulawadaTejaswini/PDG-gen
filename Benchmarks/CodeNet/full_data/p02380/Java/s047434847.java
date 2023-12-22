import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        int C = Integer.parseInt(sc.next());
        double radian = Math.toRadians(C);

        double h = b * Math.sin(radian);
        double S = a * h / 2;
        double a1 = b * Math.cos(radian);
        double a2 = a - a1;
        double c = Math.sqrt(a2 * a2 + h * h);
        out.printf("%.10f\n", S);
        out.printf("%.10f\n", a + b + c);
        out.printf("%.10f\n", h);
        out.flush();
    }
}
