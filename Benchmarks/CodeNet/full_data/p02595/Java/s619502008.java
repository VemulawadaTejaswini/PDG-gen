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
        int N = readInt();
        long D = readInt();

        long D_squared = D * D;
        int count = 0;
        for (int i = 0; i < N; i++) {
            long dx = readInt();
            long dy = readInt();
            if (dx * dx + dy * dy <= D_squared) count++;
        }
        System.out.println(count);
    }
}
