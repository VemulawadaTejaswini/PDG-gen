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
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int[] a = new int[n];
        int j = 0;
        while (st.hasMoreTokens()) {
            a[j] = Integer.parseInt(st.nextToken())-1;
            j++;
        }
        br.close();
        int c = 0;
        long m;
        ArrayList<Integer> ord = new ArrayList<>();
        do {
            ord.add(c);
            c = a[c];
        } while (!ord.contains(c));

        if (k < ord.indexOf(c)) {
            System.out.println(ord.get((int)k));
        }
        else {
            k -= ord.indexOf(c);
            m = k % (ord.size()-c);
            System.out.println((ord.get((int)(c+m))+1));
        }
    }
}
