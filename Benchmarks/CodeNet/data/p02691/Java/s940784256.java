import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 03 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] a = new int[n];
        int k = 0;
        while (st.hasMoreTokens()) {
            a[k] = Integer.parseInt(st.nextToken());
            k++;
        }
        br.close();

        int ans = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (j-i == a[i]+a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
