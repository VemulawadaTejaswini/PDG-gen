import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        HashSet<Long> set = new HashSet<>();
        LinkedList<Long> q = new LinkedList<>();
        for (long i = 1; i <= 9; i++) {
            q.add(i);
            set.add(i);
        }

        if (k <= 9) {
            pw.println(k);
            pw.close();
            return;
        }

        while (!q.isEmpty()) {
            long head = q.poll();
            for (long i = head % 10 - 1; i <= head % 10 + 1; i++) {
                if (i < 0) continue;

                long val = head * 10 + i;
                if (set.contains(val)) continue;

                set.add(val);
                q.add(val);

                if (set.size() == k) {
                    pw.println(val);
                    pw.close();
                    return;
                }
            }
        }

        pw.close();
    }
}