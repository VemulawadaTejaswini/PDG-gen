import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 21 Jun 2020.
 * Problem:
 * Round:
 */

public class Dr {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hmap = new HashMap<>();
        st = new StringTokenizer(br.readLine(), " ");
        int[] a = new int[n];
        int j = 0;
        long tot = 0;
        while (st.hasMoreTokens()) {
            a[j] = Integer.parseInt(st.nextToken());
            if (hmap.containsKey(a[j])) {
                hmap.replace(a[j], hmap.get(a[j])+1);
            }
            else {
                hmap.put(a[j], 1);
            }
            tot += a[j];
            j++;
        }
        int q = Integer.parseInt(br.readLine());
        int b, c;
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if (hmap.containsKey(b)) {
                if (hmap.containsKey(c)) {
                    hmap.replace(c, hmap.get(c) + hmap.get(b));
                }
                else {
                    hmap.put(c, hmap.get(b));
                }
                //System.out.println(hmap);
                tot += ((c-b) * hmap.get(b));
                hmap.replace(b, 0);
            }
            System.out.println(tot);
        }
        br.close();
    }
}
