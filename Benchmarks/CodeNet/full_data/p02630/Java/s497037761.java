import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(line[i]);
        }
        int q = Integer.parseInt(br.readLine());
        int[] b = new int[q], c = new int[q];
        for (int i = 0; i < q; ++i) {
            line = br.readLine().split(" ");
            b[i] = Integer.parseInt(line[0]);
            c[i] = Integer.parseInt(line[1]);
        }

        long sum = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            sum += a[i];
            count.put(a[i], count.getOrDefault(a[i], 0) + 1);
        }

        for (int i = 0; i < q; ++i) {
            if (count.containsKey(b[i])) {
                int changed = count.get(b[i]);
                count.remove(b[i]);
                count.put(c[i], count.getOrDefault(c[i], 0) + changed);
                sum += changed * (c[i] - b[i]);
            }
            bw.write(Long.toString(sum));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
