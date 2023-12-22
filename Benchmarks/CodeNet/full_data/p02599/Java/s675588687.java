import java.io.*;
import java.util.*;

public class Main {
    static final int CAPACITY = 11000000;
    static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static final byte[] input = new byte[CAPACITY];
    static int iP = 0;

    static void bufferAllInput() throws IOException {
        int nRead = 0;
        int n;
        while ((n = System.in.read(input, nRead, CAPACITY - nRead)) > 0)
            nRead += n;

        input[nRead] = 10;  // newline
    }

    public static int readInt() {
        while (input[iP] < '-') ++iP;

        final int DIGIT_START = '0';
        int r = input[iP] - DIGIT_START;
        byte c;
        while ((c = input[++iP]) >= DIGIT_START) r = r * 10 + c - DIGIT_START;

        return r;
    }

    public static void main(String[] args) throws IOException {
        bufferAllInput();
        solve();
        pw.close();
    }

    private static void solve() {
        int N = readInt();
        int Q = readInt();

        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            c[i] = readInt();
        }

        for (int i = 0; i < Q; i++) {
            HashSet<Integer> colors = new HashSet<>();
            for (int j = readInt() - 1, limit = readInt(); j < limit; j++) {
                colors.add(c[j]);
            }
            pw.println(colors.size());
        }
    }
}
