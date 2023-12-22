import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.text.DecimalFormat;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");

        int a, b, c, d, e, f;
        int denominator;
        double x, y;

        DecimalFormat df = new DecimalFormat("##0.000");

        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
            f = sc.nextInt();

            denominator = b * d - a * e;

            x = (b * f - c * e) / denominator;
            y = (c * d - a * f) / denominator;

            sb.append(df.format(x)).append(' ').append(df.format(y)).append('\n');
        }
        System.out.print(sb);

    }
}