import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 17 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());
        double m = Double.parseDouble(st.nextToken());
        br.close();

        h = (h * 30) + (m/2);
        m = m * 6;

        double ang = Math.abs(h-m);
        if (ang == 180) {
            System.out.println(a+b);
        }
        else {
            if (ang > 180) ang = 360 - ang;
            double ans = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) - ((2*a*b) * Math.cos(ang)));
            System.out.println(ans);
        }
    }
}
