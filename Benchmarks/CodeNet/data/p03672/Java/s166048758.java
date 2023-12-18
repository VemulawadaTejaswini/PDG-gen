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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public static boolean equal(int m, String a) {
            if (a.length() % 2 != 0) {
                return false;
            } else {
                String arr[] = a.split("");
                int i = 0, j = m;
                boolean r = true;
                while (i < m && j < arr.length) {
                    if (arr[i].equals(arr[j])) {
                        i++;
                        j++;
                    } else {
                        r = false;
                        break;
                    }

                }
                return r;
            }


        }

        public void solve(int testNumber, Scanner sn, PrintWriter out) {
            String a = sn.next();
            a = a.substring(0, a.length() - 1);
            while (a.length() != 0) {
                if (equal(a.length() / 2, a)) {
                    out.println(a.length());
                    break;
                } else {
                    a = a.substring(0, a.length() - 1);
                }
            }
        }

    }
}

