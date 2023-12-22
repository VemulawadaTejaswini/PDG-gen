import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 10 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            int[] a = new int[n];
            int j = 0;
            while (st.hasMoreTokens()) {
                a[j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }*/
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        //st = new StringTokenizer(br.readLine(), " ");
        //int[] a = new int[n];
        //int j = 0;
        //while (st.hasMoreTokens()) {
        //    a[j] = Integer.parseInt(st.nextToken());
        //    j++;
        //}
        br.close();

        int ans = Math.min(a, k);
        //a -= Math.min(a, k);
        k -= Math.min(a, k);

        k -= Math.min(b, k);

        if (k > 0) {
            ans -= k;
        }

        System.out.println(ans);
    }
}
