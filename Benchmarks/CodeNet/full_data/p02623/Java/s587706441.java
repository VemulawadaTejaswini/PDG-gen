import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        foo(reader, writer);
        writer.flush();
    }

    public static void foo(BufferedReader reader, PrintWriter writer) throws IOException {
        int result = 0;
        String[] s = reader.readLine().split(" ");
        int n = parseInt(s[0]), m = parseInt(s[1]), k = parseInt(s[2]);
        String[] a = reader.readLine().split(" ");
        String[] b = reader.readLine().split(" ");
        int l_a = a.length, l_b = b.length;
        int i = 0, j = 0;
        while (result <= k) {
            long x = Long.MAX_VALUE, y = Long.MAX_VALUE;
            if (i < l_a) x = parseLong(a[i]);
            if (j < l_b) y = parseLong(b[j]);
            if (x < y) {
                result += x;
                if (result > k) {
                    result -= x;
                    break;
                }
                i++;
            }
            else {
                result += y;
                if (result > k) {
                    result -= y;
                    break;
                }
                j++;
            }
        }
        writer.println(result);
    }
}
