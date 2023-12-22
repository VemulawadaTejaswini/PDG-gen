import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 14 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> a = new ArrayList<>();
        while (st.hasMoreTokens()) {
            a.add(Integer.parseInt(st.nextToken()));
        }
        br.close();

        int ans = x;
        for (int i = 0; i <= (n/2)+1; i++) {
            if (!a.contains(x-i)) {
                ans = x-i;
                break;
            }
            if (!a.contains(x+i)) {
                ans = x+i;
                break;
            }
        }
        System.out.println(ans);
    }
}
