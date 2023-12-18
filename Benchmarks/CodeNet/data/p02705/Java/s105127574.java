import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        double ans = num * 2 * Math.PI;

        pw.println(ans);
        pw.flush();
    }
}