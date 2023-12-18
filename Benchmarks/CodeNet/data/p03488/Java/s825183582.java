import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

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
        ABC081D solver = new ABC081D();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC081D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int[] pos = new int[2];
            pos[0] = -in.nextInt();
            pos[1] = -in.nextInt();
            ArrayList<Integer> xList = new ArrayList<Integer>();
            ArrayList<Integer> yList = new ArrayList<Integer>();

            int count = 0;
            boolean turnX = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'F') count++;
                else if (turnX) {
                    xList.add(count);
                    count = 0;
                    turnX = false;
                } else {
                    yList.add(count);
                    count = 0;
                    turnX = true;
                }
            }
            if (turnX) {
                xList.add(count);
            } else {
                yList.add(count);
            }

            pos[0] += xList.get(0);
            xList.remove(0);
            Collections.sort(xList);
            Collections.sort(yList);

            for (int i = xList.size() - 1; i >= 0; i--) {
                int cn = xList.get(i);
                if (pos[0] < 0) pos[0] += cn;
                else pos[0] -= cn;
            }
            for (int i = yList.size() - 1; i >= 0; i--) {
                int cn = yList.get(i);
                if (pos[1] < 0) pos[1] += cn;
                else pos[1] -= cn;
            }

            String ans = (pos[0] == 0 && pos[1] == 0) ? "Yes" : "No";
            out.println(ans);
        }

    }
}

