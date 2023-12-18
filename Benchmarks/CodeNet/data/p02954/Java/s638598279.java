import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GatheringChildren solver = new GatheringChildren();
        solver.solve(1, in, out);
        out.close();
    }

    static class GatheringChildren {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            int[] c = new int[s.length];

            int left = 2;
            for (int i = 1; i < s.length; i++) {
                if (s[i - 1] == 'R' && s[i] == 'L') {
                    // 分配
                    int right = 0;
                    int r_pos = i;
                    while (true) {
                        r_pos++;
                        if (s.length <= r_pos) {
                            break;
                        }
                        if (s[r_pos - 1] == 'L' && s[r_pos] == 'R') {
                            break;
                        } else {
                            right++;
                        }
                    }
                    if ((right + left) % 2 == 0) {
                        c[i - 1] = (right + left) / 2;
                        c[i] = (right + left) / 2;
                    } else {
                        if (right == 1) {
                            c[i - 1] = (right + left) / 2 + 1;
                            c[i] = (right + left) / 2;

                        } else {
                            c[i - 1] = (right + left) / 2;
                            c[i] = (right + left) / 2 + 1;
                        }
                    }
                    i = r_pos;
                    left = 2;
                } else {
                    left++;
                }
            }

            for (int i = 0; i < s.length; i++) {
                out.print(c[i] + " ");
            }
        }

    }
}

