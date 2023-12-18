import java.io.*;
import java.util.*;

public class CF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            sum += a[i];
        }

        int count = 0;
        for (int x : a) {
            if (x >= sum / (4 * m)) {
                count++;
            }
        }

        if (count >= m) {
            pw.println("Yes");
        } else {
            pw.println("No");
        }

        pw.close();
    }
}