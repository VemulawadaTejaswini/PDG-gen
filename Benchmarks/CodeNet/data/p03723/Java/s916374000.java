import java.util.*;
import java.io.*;

public class Main {

    private static PrintWriter out = new PrintWriter(System.out);
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(in.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        long count = 0, tmpA, tmpB, tmpC;

        if (a == b && a == c) {

            out.println(-1);

        } else {

            while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {

                tmpA = (b + c) / 2;
                tmpB = (a + c) / 2;
                tmpC = (a + b) / 2;

                a = tmpA; b = tmpB; c = tmpC;

                count++;
            }

            out.println(count);
        }

        out.flush();
    }
}