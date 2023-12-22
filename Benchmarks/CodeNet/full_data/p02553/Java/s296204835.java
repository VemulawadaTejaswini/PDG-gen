import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        long a = readInt();
        long b = readInt();
        long c = readInt();
        long d = readInt();

        long res = Math.max(a * c, a * d);
        long res2 = Math.max(b * c, b * d);
        System.out.println(Math.max(res, res2));
    }
}
