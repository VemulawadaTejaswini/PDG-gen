import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 21 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int[] a = new int[n];
        int j = 0;
        while (st.hasMoreTokens()) {
            a[j] = Integer.parseInt(st.nextToken());
            j++;
        }
        br.close();
        int ans = 0;
        Arrays.sort(a);
        for (int i = 0; i < k; i++) {
            ans += a[i];
        }
        System.out.println(ans);
    }
}
