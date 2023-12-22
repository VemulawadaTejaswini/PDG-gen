import java.io.*;
import java.util.*;

import static java.lang.Double.*;
import static java.lang.Math.sqrt;

public class Main {
    static PrintWriter prnt = new PrintWriter(System.out);
    static StringTokenizer st;
    static BufferedReader read;

    static void numberOfPoints() throws IOException {
        read = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(read.readLine());

        double N = parseDouble(st.nextToken());
        double D = parseDouble(st.nextToken());

        int countPoint = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(read.readLine());
            double x1 = parseDouble(st.nextToken());
            double x2 = parseDouble(st.nextToken());

            double d = sqrt((x1 * x1) + (x2 * x2));

            if (D >= d) {
                countPoint++;
            }
        }
        prnt.println(countPoint);
    }

    public static void main(String[] args) throws IOException {
        numberOfPoints();
        prnt.close();
    }
}