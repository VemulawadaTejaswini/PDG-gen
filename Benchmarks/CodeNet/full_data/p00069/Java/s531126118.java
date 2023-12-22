import java.io.*;
import java.util.*;

public class Main {
    void run() {
        while(true) {
            final int n = readInt();
            if (n == 0) break;
            final int x = readInt() - 1;
            final int y = readInt() - 1;
            final int d = readInt();
            int[][] moveTo = new int[d][n];
            for (int i = 0; i < d; i++) {
                String line = readLine();
                Arrays.fill(moveTo[i], -1);
                for (int j = 0; j < n - 1; j++) {
                    if (line.charAt(j) == '1') {
                        moveTo[i][j] = j + 1;
                        moveTo[i][j + 1] = j;
                    }
                }
                for (int j = 0; j < n; j++) {
                    if (moveTo[i][j] == -1) moveTo[i][j] = j;
                }
//                sysout.println(String.format("moveTo[%d] ", i) + Arrays.toString(moveTo[i]));
            }
            int[] xPos = new int[d + 1];
            xPos[0] = x;
            for (int i = 0; i < d; i++) {
                xPos[i + 1] = moveTo[i][xPos[i]];
            }
            int[] yPos = new int[d + 1];
            yPos[d] = y;
            for (int i = d - 1; i >= 0; i--) {
                yPos[i] = moveTo[i][yPos[i + 1]];
            }
//            sysout.println("xPos " + Arrays.toString(xPos));
//            sysout.println("yPos " + Arrays.toString(yPos));
            if (xPos[d] == yPos[d]) {
                sysout.println(0);
            } else {
                int ans = -1;
                int ansX = -1;
                for(int i = 0; i < d; ++i) {
                    if (xPos[i] - 1 == yPos[i] && moveTo[i][xPos[i]] == xPos[i] && moveTo[i][yPos[i]] == yPos[i]) {
                        ans = i + 1;
                        ansX = xPos[i];
                        break;
                    }
                    if (xPos[i] + 1 == yPos[i] && moveTo[i][xPos[i]] == xPos[i] && moveTo[i][yPos[i]] == yPos[i]){
                        ans = i + 1;
                        ansX = xPos[i] + 1;
                        break;
                    }
                }
                if (ans == -1) {
                    sysout.println(1);
                } else {
                    sysout.println(String.format("%d %d", ans, ansX));
                }
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    <T> String join(Collection<T> c, String delim) {
        StringBuilder bld = new StringBuilder();
        boolean first = true;
        for (T item : c) {
            if (!first) bld.append(delim);
            first = false;
            bld.append(item);
        }
        return bld.toString();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}