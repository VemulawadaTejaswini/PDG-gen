import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 09:59-

            Map<String, Long> cnts = new HashMap<>();

            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                char[] chars = sc.next().toCharArray();
                Arrays.sort(chars);

                cnts.compute(new String(chars), (k, v) -> v == null ? 1 : v + 1);
            }

            long total = 0L;
            for (Entry<String, Long> entry : cnts.entrySet()) {
                total += f(entry.getValue() - 1);
            }
            
            out.println(total);
        }
    }

    private static long f(long v) {
        int x = 0;
        for (int i = 1; i <= v; i++) {
            x += i;
        }
        return x;
    }

}
