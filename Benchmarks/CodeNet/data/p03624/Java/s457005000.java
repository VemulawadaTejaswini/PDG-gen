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
        public void solve(int testNumber, Scanner sn, PrintWriter out) {
            char a[] = sn.next().toCharArray();
            int arr[] = new int[26];
            for (int i = 0; i < a.length; i++) {
                arr[a[i] - 'a']++;
            }
            String r = "";
            String al[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

            for (int i = 0; i < 26; i++) {
                if (arr[i] == 0) {
                    r = al[i];
                    break;
                }
            }
            if (r.equals("")) {
                out.println("None");
            } else {
                out.println(r);
            }
        }

    }
}

