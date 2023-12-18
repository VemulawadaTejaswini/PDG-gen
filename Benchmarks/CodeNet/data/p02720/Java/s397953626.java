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

            ArrayList<Long> nbrs = new ArrayList<>();
            if (head % 10 != 0) nbrs.add(head % 10 - 1);
            nbrs.add(head % 10);
            if (head % 10 != 9) nbrs.add(head % 10 + 1);

            for (Long nbr : nbrs) {
                long val = head * 10 + nbr;
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