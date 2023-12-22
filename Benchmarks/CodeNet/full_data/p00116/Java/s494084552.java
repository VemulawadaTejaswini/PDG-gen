import java.io.*;
import java.util.*;

public class Main {
    void run() {
        while (true) {
            int H = readInt();
            int W = readInt();
            if(H == 0 && W == 0) break;
            char[][] board = new char[H][W];
            for (int i = 0; i < H; i++) {
                board[i] = read().toCharArray();
            }
            int[][] left = new int[H][W];
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (board[y][x] == '*') {
                        left[y][x] = 0;
                    }
                    else {
                        if (x == 0) left[y][x] = 1;
                        else left[y][x] = left[y][x - 1] + 1;
                    }
                }
//                sysout.printf("left[%d] = %s\n", y, Arrays.toString(left[y]));
            }

            int maxArea = 0;
            for (int x = 0; x < W; x++) {
//                sysout.println("x = " + x);

                int[] L = new int[H];
                int[] R = new int[H];
                Stack<Integer> stk = new Stack<>();
                for (int y = 0; y < H; y++) {
                    while (stk.isEmpty() == false && left[stk.peek()][x] >= left[y][x]) stk.pop();
                    if (stk.isEmpty()) L[y] = 0;
                    else L[y] = stk.peek() + 1;
                    stk.push(y);
                }

                stk.clear();
                for (int y = H - 1; y >= 0; y--) {
                    while (stk.isEmpty() == false && left[stk.peek()][x] >= left[y][x]) stk.pop();
                    if (stk.isEmpty()) R[y] = H;
                    else R[y] = stk.peek();
                    stk.push(y);
                }

                for (int y = 0; y < H; y++) {
//                    sysout.printf("%d: %d <> %d\n", y, L[y], R[y]);
                    maxArea = Math.max(maxArea, left[y][x] * (R[y] - L[y]));
                }
            }

            sysout.println(maxArea);
        }
    }

    public static void main(String[] args) {
        new Main().run();
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