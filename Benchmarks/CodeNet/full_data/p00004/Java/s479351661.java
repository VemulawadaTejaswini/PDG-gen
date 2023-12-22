import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Main {

    public static void main(String[] arg) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToke;
        String line;
        // ax + by = c
        // dx + ey = f
        while ((line = in.readLine()) != null) {
            strToke = new StringTokenizer(line);
            int a = Integer.parseInt(strToke.nextToken());
            int b = Integer.parseInt(strToke.nextToken());
            int c = Integer.parseInt(strToke.nextToken());
            int d = Integer.parseInt(strToke.nextToken());
            int e = Integer.parseInt(strToke.nextToken());
            int f = Integer.parseInt(strToke.nextToken());
            calc(a, b, c, d, e, f);
        }
        //
    }

    private static void calc(int a, int b, int c, int d, int e, int f) {
        BigDecimal y = BigDecimal.valueOf((a * f - d * c) / (a * e - d * b));
        BigDecimal x = BigDecimal.valueOf((c - b * y.intValue()) / a);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(String.valueOf(df.format(x)) + " " + String.valueOf(df.format(y)));
    }
}