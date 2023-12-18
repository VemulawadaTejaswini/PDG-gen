import java.util.*;
import java.io.*;

public class Main {

    private static PrintWriter out = new PrintWriter(System.out);
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(in.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int count = 0, tmpA, tmpB, tmpC;
        boolean yes = false;

        while (a != 0 && b != 0 && c != 0 && !yes && !(a == b && a == c)){


            tmpA = b / 2 + c / 2;
            tmpB = a / 2 + c / 2;
            tmpC = b / 2 + a / 2;

            a = tmpA; b = tmpB; c = tmpC;

            yes = check(a, b, c);
            count++;
        }

        if (yes) out.println(count); else out.println(-1);

        out.flush();
    }

    private static boolean check(int a, int b, int c) {

        if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0)
            return true;

        return false;
    }
}