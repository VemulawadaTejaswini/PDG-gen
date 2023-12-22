
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = sc.next();
        String t = sc.next();

        int HOGE = 100000;
        int min = HOGE;
        for (int i = 0; i <= s.length() - t.length(); i++) {
            int count = 0;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    count++;
                }
            }
            min = Math.min(min, count);
        }
        System.out.println(min == HOGE ? 0 : min);
        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
