import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static InputStream is;
    static PrintWriter out;
    static String INPUT = "";

    final int INF = Integer.MAX_VALUE;
    final int MIN = Integer.MIN_VALUE;

    static void solve() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int[] res = new int[26];
        line = line.toLowerCase().replace(" ", "");
        for (int i = 0; i < line.length(); i++) {
            res[((int)line.charAt(i)) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (i + 97) + " : " + res[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        long S = System.currentTimeMillis();
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);

        solve();
        out.flush();
        long G = System.currentTimeMillis();
    }
}