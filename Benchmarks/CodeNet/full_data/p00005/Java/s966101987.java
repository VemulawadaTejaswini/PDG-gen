import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] arg) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToke;
        String line;
        long gcd; // 最大公約数
        long lcm; // 最小公倍数

        // ab = gcd * lcm
        while ((line = in.readLine()) != null) {
            strToke = new StringTokenizer(line);
            long a = Integer.parseInt(strToke.nextToken());
            long b = Integer.parseInt(strToke.nextToken());
            long aStock = new Long(a).longValue();
            long bStock = new Long(b).longValue();
            int c;
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            gcd = a;
            lcm = (aStock * bStock) / gcd;

            System.out.println(gcd + " " + lcm);
        }
    }
}