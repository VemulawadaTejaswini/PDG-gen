import java.io.*;
import java.math.*;
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
            BigDecimal y = new BigDecimal((a * f - d * c) / (a * e - d * b)).setScale(3, BigDecimal.ROUND_HALF_UP);
            BigDecimal x = new BigDecimal((c - b * y.intValue()) / a).setScale(3, BigDecimal.ROUND_HALF_UP);
            System.out.println(x + " " + y);
        }
    }
}