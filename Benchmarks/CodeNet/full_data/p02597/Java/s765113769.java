import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    private static String readToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        pw.println(solve());
        pw.close();
    }

    private static int solve() throws IOException {
        int N = readInt();
        char[] cs = readToken().toCharArray();

        int count = 0;
        if (cs[0] == 'W' && cs[1] == 'R') count++;
        for (int i = 2; i < N - 1; i++) {
            if (cs[i - 1] == 'W' && cs[i] == 'R') {
                count++;
                if (cs[i - 2] == 'W' && cs[i + 1] == 'R') count++;
            }
        }
        if (cs[N - 2] == 'W' && cs[N - 1] == 'R') count++;

        return count;
    }
}
