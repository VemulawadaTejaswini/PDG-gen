import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 19 Apr 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        //int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int a;
        int tot = 0;
        while (st.hasMoreTokens()) {
            a = Integer.parseInt(st.nextToken());
            tot += a;
        }
        br.close();

        System.out.println(Math.max(n-tot, -1));
    }
}
