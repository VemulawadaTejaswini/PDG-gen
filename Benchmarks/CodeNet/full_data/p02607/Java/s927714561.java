import java.io.*;
import java.util.*;

public class B_AnOddProblem {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if ( readInt() % 2 == 1 && i % 2 == 1) count ++;
        }

        pw.println(count);
        pw.close();
    }
}
