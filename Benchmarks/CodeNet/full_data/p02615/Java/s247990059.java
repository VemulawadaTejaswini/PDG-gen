import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 05 Jul 2020.
 * Problem:
 * Round:
 */

public class D {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] a = new int[n];
        int j = 0;
        long ans = 0;
        while (st.hasMoreTokens()) {
            a[j] = Integer.parseInt(st.nextToken());
            ans += a[j];
            j++;
        }
        br.close();
        Arrays.sort(a);
        ans -= a[0];

        System.out.println(ans);
    }
}
